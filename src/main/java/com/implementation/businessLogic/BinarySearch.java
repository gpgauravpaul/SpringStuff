package com.implementation.businessLogic;
import com.interfaces.MaxValue;
import com.interfaces.Sorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    @Qualifier("bubble")
    Sorting bubbleSort;
    MaxValue value;

    public int logic() {
        return bubbleSort.sort(new int[] {23,54,56,76});
    }
   int minValue = Integer.MIN_VALUE;

    public int findMaxValueFromArray() {
      int arrayValue[] = value.findMaxValue();

      for(int value: arrayValue) {
          if (minValue < value) {
            minValue = value;
        } }
        return minValue;
    }
}