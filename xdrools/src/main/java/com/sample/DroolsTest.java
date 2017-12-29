package com.sample;

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

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {

final List<String> knownVariables = new ArrayList<String>();
        
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
            Message message2 = new Message();
            message2.setMessage("Hello Wo222rld");
            message2.setStatus(Message.HELLO);
            kSession.insert(message2);  
            Person me=    new Person("ssaaaa", 17d);
            List<Integer> kk=new ArrayList();
            
            Set<Person> persons=new HashSet<Person>();
            persons.add(me);
            message.setPersons(persons);
            kk.add(Integer.valueOf(12));
            kk.add(Integer.valueOf(22));
            kk.add(Integer.valueOf(32));
            kk.add(Integer.valueOf(42));
            me.setCarts(kk);

            me.setAge(41d);
            kSession.insert(me); 
            Person mke=    new Person("fff",27d);
            persons.add(mke);
            
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
