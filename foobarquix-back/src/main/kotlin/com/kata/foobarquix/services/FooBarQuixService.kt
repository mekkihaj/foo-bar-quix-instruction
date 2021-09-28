package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        var result = StringBuilder();
        if (inputNumber % 3 == 0) {
            result.append("Foo");
        }
        if (inputNumber % 5 == 0) {
            result.append("Bar");
        }
        if (inputNumber % 7 == 0) {
            result.append("Quix");
        }

        val inputNumberStr: String = inputNumber.toString();
        val inputNumberCharArray: CharArray = inputNumberStr.toCharArray();
        for(i in inputNumberCharArray) {
            if (i == '0') {
                if(inputNumberStr.length == 1){
                  result.clear();
                }
                
                result.append("Buzz");
            }
            if (i == '3') {
                result.append("Foo");
            }
            if (i == '5') {
                result.append("Bar");
            }
            if (i == '7') {
                result.append("Quix");
            }
        }

        if (result.isEmpty()) {
            return inputNumberStr.toString();
        } else {
            return result.toString();
        }
    }

}