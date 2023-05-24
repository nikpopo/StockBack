package com.finex.robot.service.tinkoff;

import com.finex.robot.service.dictionary.InstrumentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor
@ConditionalOnProperty(name = "tinkoff.emulator", havingValue = "true", matchIfMissing = true)
public class TinkoffMockAPI extends ATinkoffAPI {

    private static final BigDecimal PERCENT = new BigDecimal("0.00025");

    @Override
    public OrderResult buy(InstrumentService.Instrument instrument, BigDecimal price, Integer count) {
        return OrderResult.builder()
                .commission(calculateCommission(price, count))
                .price(price)
                .build();
    }

    @Override
    public OrderResult sell(InstrumentService.Instrument instrument, BigDecimal price, Integer count) {
        return OrderResult.builder()
                .commission(calculateCommission(price, count))
                .price(price)
                .build();
    }

    private BigDecimal calculateCommission(BigDecimal price, Integer count) {
        return price.multiply(PERCENT).multiply(BigDecimal.valueOf(count));
    }

}
