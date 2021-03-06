package org.knowm.xchange.kraken.dto.trade.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.kraken.dto.KrakenResult;
import org.knowm.xchange.kraken.dto.trade.KrakenOrderResponse;

public class KrakenOrderResult extends KrakenResult<KrakenOrderResponse> {

  /**
   * Constructor
   *
   * @param result
   * @param error
   */
  public KrakenOrderResult(
      @JsonProperty("result") KrakenOrderResponse result, @JsonProperty("error") String[] error) {

    super(result, error);
  }
}
