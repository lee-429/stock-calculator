package com.hyunhak.stockcalculator.controller;

import com.hyunhak.stockcalculator.domain.Stock;
import com.hyunhak.stockcalculator.dto.StockRequestDto;
import com.hyunhak.stockcalculator.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stock")
    public String stockForm() {
        return "stock";
    }

    @PostMapping("/stock")
    public String calculate(StockRequestDto dto, Model model) {
        Stock stock = stockService.createStock(dto);

        long profit = stock.calculateProfit();
        long total = stock.calculateTotalAmount();
        double rate = stock.calculateRate();

        model.addAttribute("profit", profit);
        model.addAttribute("total", total);
        model.addAttribute("rate", rate);
        model.addAttribute("isProfit", profit >= 0);

        return "stock";
    }
}
