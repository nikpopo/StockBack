package com.finex.robot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "candle",
        indexes = {
                @Index(columnList = "figi"),
                @Index(columnList = "date_time"),
                @Index(columnList = "inter_val"),
                @Index(columnList = "date_time, figi, inter_val", unique = true)
        })
public class CandleDomainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "figi", nullable = false)
    private String figi;

    @Column(name = "highest_price", nullable = false, scale = 8, precision = 19)
    private BigDecimal highestPrice;

    @Column(name = "lowest_price", nullable = false, scale = 8, precision = 19)
    private BigDecimal lowestPrice;

    @Column(name = "open_price", nullable = false, scale = 8, precision = 19)
    private BigDecimal openPrice;

    @Column(name = "closing_price", nullable = false, scale = 8, precision = 19)
    private BigDecimal closingPrice;

    @Column(name = "date_time", nullable = false)
    private OffsetDateTime dateTime;

    @Column(name = "inter_val", nullable = false)
    private String interval;
}