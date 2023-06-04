package com.implementation.implementationOfBusinessLogics;

import com.interfaces.Sorting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("merge")
public class MergeSort implements Sorting {


    @Override
    public int sort(int[] array) {
        return 10;
    }
}
