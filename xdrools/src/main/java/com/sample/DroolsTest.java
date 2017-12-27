package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message); 
            kSession.insert(new String("abbbbbbbbbbbaaa"));  
            
            Person me=    new Person("ssaaaa", 17d);
            List<Integer> kk=new ArrayList();
            kk.add(Integer.valueOf(12));
            kk.add(Integer.valueOf(22));
            kk.add(Integer.valueOf(32));
            kk.add(Integer.valueOf(42));
            me.setCarts(kk);

            me.setAge(41d);
            kSession.insert(me); 
            Person mke=    new Person("ssakaaa",27d);
            mke.getCarts().add(Integer.valueOf(190));
            kSession.insert(mke); 
            FactHandle meHandle = kSession.insert( me );
            //me.setName("California Aavenue");
           // kSession.update( meHandle, me, "age", "name" );
            
           // ((InternalAgenda)  kSession.getAgenda()).activateRuleFlowGroup("group1");
            kSession.fireAllRules();
            
            
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public boolean contains(String k,String b){
    	return k.contains(b);
    }

     
}
