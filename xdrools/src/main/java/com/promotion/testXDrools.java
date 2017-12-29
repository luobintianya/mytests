package com.promotion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.drools.core.base.mvel.MVELDebugHandler;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.mvel2.MVELRuntime;
import org.mvel2.debug.Debugger;
import org.mvel2.debug.Frame;

import com.sample.Person;

public class testXDrools {


    public static final void main(String[] args) {
        try {
 
			        	    MVELRuntime.resetDebugger();
			        	    MVELDebugHandler.setDebugMode(true);
			        	    MVELRuntime.setThreadDebugger(new Debugger() {
			        	           public int onBreak(Frame frame) {
			        	               System.out.println("------");
			        	            
			        	               for (String var: frame.getFactory().getKnownVariables()) {
			        	                   System.out.println(   frame.getLineNumber()+"  " + var+" "+frame.getFactory().getVariableResolver(var).getValue()); 
			        	               }
			        	               return 0;
			        	           }
			          }); 
			        	    
        	    
        	    
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			CategoryRAO category600213= new CategoryRAO();
			category600213.setCode("600213"); 
		
			CategoryRAO category600208= new CategoryRAO();
			category600208.setCode("600208");
			CategoryRAO category600214= new CategoryRAO();
			category600214.setCode("600214");
			
			
			ProductRAO product=new ProductRAO();
			product.setCode("11111");
			Set<CategoryRAO> categorys1=new HashSet<CategoryRAO>();
			categorys1.add(category600213);
			product.setCategories(categorys1);
			
			ProductRAO product2=new ProductRAO();
			product2.setCode("22222");
			Set<CategoryRAO> categorys3=new HashSet<CategoryRAO>();
			categorys3.add(category600208);
			product2.setCategories(categorys3);
			
			ProductRAO product3=new ProductRAO();
			product3.setCode("33333");
			Set<CategoryRAO> categorys4=new HashSet<CategoryRAO>();
			categorys4.add(category600214);
			product3.setCategories(categorys4); 
			OrderEntryRAO entry=new OrderEntryRAO();
			entry.setProduct(product);
			entry.setQuantity(3);
			entry.setTotalPrice(BigDecimal.valueOf(100)); 
			kSession.insert(entry);
			OrderEntryRAO entry2=new OrderEntryRAO();
			entry2.setProduct(product2);
			entry2.setQuantity(2);
			entry2.setTotalPrice(BigDecimal.valueOf(100));
			kSession.insert(entry2);
			OrderEntryRAO entry3=new OrderEntryRAO();
			entry3.setProduct(product3);
			entry3.setQuantity(4);
			entry3.setTotalPrice(BigDecimal.valueOf(200));
			kSession.insert(entry3); 
			kSession.insert(category600213);
			kSession.insert(category600208);
			kSession.insert(category600214);
			kSession.insert(product);
			kSession.insert(product2);
			kSession.insert(product3);
	
			 
			kSession.fireAllRules();
            
			 
            
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public boolean contains(String k,String b){
    	return k.contains(b);
    }

     

}
