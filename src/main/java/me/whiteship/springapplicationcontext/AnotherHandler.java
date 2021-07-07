package me.whiteship.springapplicationcontext;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    public void handle(MyEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another: "+event.getData());
    }
}
