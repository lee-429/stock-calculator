package com.hyunhak.stockcalculator.domain;

import lombok.Getter;

@Getter
public class Stock {

    private final long averagePrice; // 평단
    private final long currentPrice; // 현재 가
    private final long holdingShares; // 보유 주

    public Stock(long averagePrice, long currentPrice, long holdingShares) {
        this.averagePrice = averagePrice;
        this.currentPrice = currentPrice;
        this.holdingShares = holdingShares;
    }

    // 수익
    public long calculateProfit() {
        return (currentPrice - averagePrice) * holdingShares;
    }

    // 수익률
    public double calculateRate() {
        double rate = (double) (currentPrice - averagePrice) / averagePrice * 100;
        return Math.round(rate * 10) / 10.0;
    }

    // 총 금액
    public long calculateTotalAmount() {
        return currentPrice * holdingShares;
    }
}
