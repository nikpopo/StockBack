package com.finex.robot.strategy.instrument_by_fiat;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BuyP40AndTP1PercentAndSL3PercentStrategy extends AInstrumentByFiatStrategy {

    private static final Map FIGIES = Map.of(
            "BBG004730JJ5", 10,    // Московская биржа
            "BBG008NMBXN8", 1      // Robinhood
    );

    public Map<String, Integer> getFigies() {
        return FIGIES;
    }

    @Override
    public AInstrumentByFiatStrategy.BuyCriteria getBuyCriteria() {
        return AInstrumentByFiatStrategy.BuyCriteria.builder().lessThenPercentile(40).build();
    }

    @Override
    public AInstrumentByFiatStrategy.SellCriteria getSellCriteria() {
        return AInstrumentByFiatStrategy.SellCriteria.builder().takeProfitPercent(1f).stopLossPercent(3f).build();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
