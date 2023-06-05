package com.implementation.businessLogic;
import com.interfaces.Sorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {

    @Autowired
    @Qualifier("bubble")
    Sorting bubbleSort;

    public int logic() {
        return bubbleSort.sort(new int[] {23,54,56,76});
    }
}