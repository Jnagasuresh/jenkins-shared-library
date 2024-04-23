package com.nagsacademy.builds;
class Calculator {
    def jenkins
    Calculator(jenkins){
        this.jenkins = jenkins
    }

    def add(firstNumber, secondNumber){
        //body
        return firstNumber + secondNumber
    }

    def multiply(firstNumber, secondNumber){
        //body
        return firstNumber * secondNumber
    }
}