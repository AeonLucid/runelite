/*
 * Copyright (c) 2018, AeonLucid <https://github.com/AeonLucid>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.http.service.osb.grandexchange;

import java.time.Instant;
import lombok.Data;
import net.runelite.http.service.osb.grandexchange.osbuddy.GuidePriceResponse;

@Data
public class GrandExchangeEntry
{
	private int item_id;

	private int overall;

	private int buying;

	private int buying_quantity;

	private int selling;

	private int selling_quantity;

	private Instant last_update;

	public GrandExchangeEntry()
	{
	}

	public GrandExchangeEntry(int itemId, GuidePriceResponse guidePrice, Instant lastUpdate)
	{
		this.item_id = itemId;
		this.overall = guidePrice.getOverall();
		this.buying = guidePrice.getBuying();
		this.buying_quantity = guidePrice.getBuyingQuantity();
		this.selling = guidePrice.getSelling();
		this.selling_quantity = guidePrice.getSellingQuantity();
		this.last_update = lastUpdate;
	}
}
