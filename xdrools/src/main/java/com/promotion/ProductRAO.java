package com.promotion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ProductRAO  implements Serializable  {


	 

	/** <i>Generated property</i> for <code>ProductRAO.code</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String code;
	
	private BigDecimal price=BigDecimal.valueOf(0);

	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/** <i>Generated property</i> for <code>ProductRAO.categories</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Set<CategoryRAO> categories;
	
	public ProductRAO()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setCategories(final Set<CategoryRAO> categories)
	{
		this.categories = categories;
	}

		
	
	public Set<CategoryRAO> getCategories() 
	{
		return categories;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final ProductRAO other = (ProductRAO) o;
			return new  EqualsBuilder()
			.append(getCode(), other.getCode()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new  HashCodeBuilder()
		.append(getCode()) 
		.toHashCode();
	}


}
