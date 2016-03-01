package lab_11_20.lab19;
// Created by boykodm on 19.02.16.17:41

public class ExchangeMoney {
    final static int[] exchangeMonets = {1,2,5,10,25,50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        for ( int i = exchangeMonets.length-1; i >= 0; i-- ) {
            if ( amountForExchange / exchangeMonets[i] >= 1 ) {
                return exchangeAmountOfCoinsBrutForce(i, amountForExchange);
            }
        }

        return 0;
    }

    public static int exchangeAmountOfCoinsBrutForce(int exchangeMonetIndex, int amountForExchange) {
        if ( exchangeMonetIndex == 0 || amountForExchange == 0 ) {
            return 1;
        }

        if ( amountForExchange >= exchangeMonets[exchangeMonetIndex] ) {
            return exchangeAmountOfCoinsBrutForce(exchangeMonetIndex - 1, amountForExchange) + exchangeAmountOfCoinsBrutForce(exchangeMonetIndex, amountForExchange - exchangeMonets[exchangeMonetIndex]);
        }

        return exchangeAmountOfCoinsBrutForce(exchangeMonetIndex - 1, amountForExchange);
    }
}
