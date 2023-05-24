package com.finex.robot.service.processor;

import com.finex.robot.entity.CandleDomainEntity;
import com.finex.robot.strategy.AStrategy;

import java.math.BigDecimal;

interface ICalculatorService<T extends AStrategy> {
    boolean isShouldBuy(T strategy, CandleDomainEntity candle);

    boolean isShouldSell(T strategy, CandleDomainEntity candle, BigDecimal purchaseRate);

    AStrategy.Type getStrategyType();
}
