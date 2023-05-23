package com.struchev.invest.strategy;

import com.struchev.invest.entity.CandleDomainEntity;
import com.struchev.invest.repository.CandleRepository;
import com.struchev.invest.repository.OrderRepository;
import com.struchev.invest.service.order.OrderService;
import com.struchev.invest.service.processor.PurchaseService;
import com.struchev.invest.service.report.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Comparator;

import static org.junit.Assert.assertTrue;

@SpringBootTest
@Slf4j
@ActiveProfiles(profiles = "test")
class StrategiesByCandleHistoryTests {


}