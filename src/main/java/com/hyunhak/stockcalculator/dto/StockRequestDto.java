package com.hyunhak.stockcalculator.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockRequestDto {

    private long averagePrice;
    private long currentPrice;
    private long holdingShares;
}
