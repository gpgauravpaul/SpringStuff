package com.implementation.businessLogic;
import com.interfaces.Sorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {
    @Autowired
    @Qualifier("bubble")
    Sorting bubbleSort;

    @Value("${name}")
    public String name;

    public int logic() {
        System.out.println(name);
        return bubbleSort.sort(new int[] {23,54,56,76});
    }
}