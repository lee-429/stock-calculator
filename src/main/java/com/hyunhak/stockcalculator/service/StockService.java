package com.hyunhak.stockcalculator.service;

import com.hyunhak.stockcalculator.domain.Stock;
import com.hyunhak.stockcalculator.dto.StockRequestDto;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    public Stock createStock(StockRequestDto dto) {
        return new Stock(
            dto.getAveragePrice(),
            dto.getCurrentPrice(),
            dto.getHoldingShares()
        );
    }
}
