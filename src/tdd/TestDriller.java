package tdd;

public class TestDriller {
    public int noOfCopies(int noOfCopies) {
        int price = 0;
        if (noOfCopies >0 && noOfCopies <= 4) price = 2000 * noOfCopies;
        if (noOfCopies >=5 && noOfCopies <= 9) price = 1800 * noOfCopies;
        if (noOfCopies >=10 && noOfCopies <= 29) price = 1600 * noOfCopies;
        if (noOfCopies >29 && noOfCopies <= 49) price = 1500 * noOfCopies ;
        if (noOfCopies >49 && noOfCopies <= 99) price = 1300 * noOfCopies;
        if (noOfCopies >99 && noOfCopies <= 199) price = 1200 * noOfCopies;
        if (noOfCopies >199 && noOfCopies <= 499) price = 1100* noOfCopies;
        if (noOfCopies >499) price = 1000 * noOfCopies;
        return price;
    }
}
