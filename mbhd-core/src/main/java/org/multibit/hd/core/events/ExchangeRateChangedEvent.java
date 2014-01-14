package org.multibit.hd.core.events;

import java.math.BigDecimal;

/**
 * <p>Event to provide the following to application API:</p>
 * <ul>
 * <li>Notification of an exchange rate change</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */
public class ExchangeRateChangedEvent {

  private final BigDecimal rate;
  private final String exchangeName;

  /**
   * @param rate         The amount in the local currency (e.g. 1000 means 1000 USD = 1 bitcoin)
   * @param exchangeName The exchange name
   */
  public ExchangeRateChangedEvent(BigDecimal rate, String exchangeName) {
    this.rate = rate;
    this.exchangeName = exchangeName;
  }

  /**
   * @return The rate in the local currency (e.g. 1000 means 1000 USD = 1 bitcoin)
   */
  public BigDecimal getRate() {
    return rate;
  }

  /**
   * @return The name of the exchange (e.g. "Bitstamp")
   */
  public String getExchangeName() {
    return exchangeName;
  }

  @Override
  public String toString() {
    return "ExchangeRateChangedEvent{" +
      "rate=" + rate +
      ", exchangeName='" + exchangeName + '\'' +
      '}';
  }
}
