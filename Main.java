class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int mmTotal;
    double mmBlue;
    double mmBrown;
    double mmGreen;
    double mmOrange;
    double mmRed;
    double mmYellow;

    mmTotal = 55 *11;

    mmBlue = mmTotal * .24;
    mmBrown = mmTotal * .13;
    mmGreen = mmTotal * .16;
    mmOrange = mmTotal * .20;
    mmRed = mmTotal * .13;
    mmYellow = mmTotal * .14;

    System.out.println("Blue: " + mmBlue);
    System.out.println("Brown: " + mmBrown);
    System.out.println("Green: " + mmGreen);
    System.out.println("Orange: " + mmOrange);
    System.out.println("Red: " + mmRed);
    System.out.println("Yellow: " + mmYellow);

    double mmColorSum;

    mmColorSum = mmBlue + mmBrown + mmGreen + mmOrange + mmRed + mmYellow;

    System.out.println("Sum: " + mmColorSum);

    if(mmBlue < mmBrown & mmRed > mmOrange)
    System.out.println("Blue under Brown and Red ocer Orange");

    if(mmBrown >= mmGreen)
    System.out.println("Brown is greater than or equal to Green");

    if(mmColorSum == mmTotal)
    System.out.println("Numbers match");

  }
}