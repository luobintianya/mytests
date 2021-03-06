package com.promotion;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CategoryRAO  implements Serializable {


 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CategoryRAO.code</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String code;
	
	public CategoryRAO()
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
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final CategoryRAO other = (CategoryRAO) o;
			return new EqualsBuilder()
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
