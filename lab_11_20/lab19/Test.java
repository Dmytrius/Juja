package lab_11_20.lab19;
// Created by boykodm on 19.02.16.17:41

public class Test {

    public static void main(String[] args) {
        int testMoney=5;
        int expectedValue=4;

        int actualValue=ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue!=expectedValue)
            throw new AssertionError("Money= "+ testMoney+ "  number of variants=  "+expectedValue + " but found " + actualValue);

        System.out.print("OK");
    }
}


