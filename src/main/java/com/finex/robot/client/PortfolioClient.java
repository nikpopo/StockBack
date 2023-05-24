package com.finex.robot.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.tinkoff.piapi.contract.v1.PortfolioRequest;
import ru.tinkoff.piapi.contract.v1.PortfolioResponse;
import ru.tinkoff.piapi.core.InvestApi;

@Component
public class PortfolioClient {
    private final String token = "t.4--8c1KikZtp8ZIztul45I53FhfGaPEosHZZWLaDi7cpCqIIwGeITgd8OiQ7sDWYRsZbYwPrdFkkPpIkombSpw";
    private final InvestApi api = InvestApi.createSandbox(token);



    public PortfolioResponse getPortfolio() {
        String id = "6b9ed9bc-5550-4091-ae79-2fd6bc15d151";
        System.out.println("!!!!! " + api.getSandboxService().getPositionsSync(id));
        var portfolio = api.getSandboxService().getPortfolioSync(id);



       // PortfolioResponse response = new PortfolioResponse();
       // response.setTotalAmountBonds(portfolio.getTotalAmountBonds());
       // response.setTotalAmountEtf(portfolio.getTotalAmountEtf());
      //  response.setTotalAmountCurrencies(portfolio.getTotalAmountCurrencies());
       // response.setTotalAmountFutures(portfolio.getTotalAmountFutures());
       // response.setTotalAmountShares(portfolio.getTotalAmountShares());
       // response.setExpectedYield(portfolio.getExpectedYield());

//        List<PortfolioPosition> positions = portfolio.getPositionsList();
//        List<PositionResponse> positionResponses = new ArrayList<>();
//
//        for (int i = 0; i < positions.size(); i++) {
//            PortfolioPosition position = positions.get(i);
//            PositionResponse positionResponse = new PositionResponse();
//            positionResponse.setFigi(position.getFigi());
//            positionResponse.setQuantity(position.getQuantity());
//            positionResponse.setCurrentPrice(position.getCurrentPrice());
//            positionResponse.setExpectedYield(position.getExpectedYield());
//
//            positionResponses.add(positionResponse);
//        }
        //response.setPositions(positionResponses);

        return portfolio;
    }

}
