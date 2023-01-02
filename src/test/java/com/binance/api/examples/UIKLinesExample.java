package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.Candlestick;
import com.binance.api.client.domain.market.CandlestickInterval;
import java.util.List;

public class UIKLinesExample {

  public static void main(String[] args) {
    new UIKLinesExample();
  }

  public UIKLinesExample() {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
    BinanceApiRestClient restClient = factory.newRestClient();

    List<Candlestick> result = restClient.getCandlestickHistoryBars("BTCUSDT", CandlestickInterval.FIVE_MINUTES, 168,
        null, null);

    System.out.println(result.size());

    result.stream()
        .forEach(System.out::println);
  }
}
