package com.finex.robot.controller;

import com.finex.robot.client.PortfolioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.piapi.contract.v1.PortfolioResponse;

@RestController
public class PortfolioController {

    private final PortfolioClient portfolioClient;

    @Autowired
    public PortfolioController(PortfolioClient portfolioClient) {
        this.portfolioClient = portfolioClient;
    }


    @GetMapping("/getPortfolio")
    public PortfolioResponse getPortfolio() {
        System.out.println("1123");
        return portfolioClient.getPortfolio();
    }
}