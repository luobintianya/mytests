package com.promotion;

import java.math.BigDecimal;
import java.util.List;

public class OrderEntryRAO {


	 

	/** <i>Generated property</i> for <code>OrderEntryRAO.entryNumber</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Integer entryNumber;

	/** <i>Generated property</i> for <code>OrderEntryRAO.quantity</code> property defined at extension <code>ruleengineservices</code>. */
		
	private int quantity;

	/** <i>Generated property</i> for <code>OrderEntryRAO.basePrice</code> property defined at extension <code>ruleengineservices</code>. */
		
	private BigDecimal basePrice;

	/** <i>Generated property</i> for <code>OrderEntryRAO.totalPrice</code> property defined at extension <code>ruleengineservices</code>. */
		
	private BigDecimal totalPrice;

	/** <i>Generated property</i> for <code>OrderEntryRAO.currencyIsoCode</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String currencyIsoCode;

	/** <i>Generated property</i> for <code>OrderEntryRAO.order</code> property defined at extension <code>ruleengineservices</code>. */
		
 

	/** <i>Generated property</i> for <code>OrderEntryRAO.product</code> property defined at extension <code>ruleengineservices</code>. */
		
	private ProductRAO product;

	/** <i>Generated property</i> for <code>OrderEntryRAO.discountValues</code> property defined at extension <code>ruleengineservices</code>. */
		
 

	/** <i>Generated property</i> for <code>OrderEntryRAO.entryGroupNumbers</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<Integer> entryGroupNumbers;

	/** <i>Generated property</i> for <code>OrderEntryRAO.saleType</code> property defined at extension <code>uniasiafacades</code>. */
		
 
	public OrderEntryRAO()
	{
		// default constructor
	}
	
		
	
	public void setEntryNumber(final Integer entryNumber)
	{
		this.entryNumber = entryNumber;
	}

		
	
	public Integer getEntryNumber() 
	{
		return entryNumber;
	}
	
		
	
	public void setQuantity(final int quantity)
	{
		this.quantity = quantity;
	}

		
	
	public int getQuantity() 
	{
		return quantity;
	}
	
		
	
	public void setBasePrice(final BigDecimal basePrice)
	{
		this.basePrice = basePrice;
	}

		
	
	public BigDecimal getBasePrice() 
	{
		return basePrice;
	}
	
		
	
	public void setTotalPrice(final BigDecimal totalPrice)
	{
		this.totalPrice = totalPrice;
	}

		
	
	public BigDecimal getTotalPrice() 
	{
		return totalPrice;
	}
	
		
	
	public void setCurrencyIsoCode(final String currencyIsoCode)
	{
		this.currencyIsoCode = currencyIsoCode;
	}

		
	
	public String getCurrencyIsoCode() 
	{
		return currencyIsoCode;
	}
	
		
	 
		
	
	public void setProduct(final ProductRAO product)
	{
		this.product = product;
	}

		
	
	public ProductRAO getProduct() 
	{
		return product;
	}
	 
		
	
	public void setEntryGroupNumbers(final List<Integer> entryGroupNumbers)
	{
		this.entryGroupNumbers = entryGroupNumbers;
	}

		
	
	public List<Integer> getEntryGroupNumbers() 
	{
		return entryGroupNumbers;
	}
	
		
	 
	
 

}
