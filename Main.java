class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalMms;
    totalMms = 55*11;
    
    double blue, brown, green, orange, red, yellow;
    blue = totalMms *0.24;
    brown = totalMms *0.13;
    green = totalMms *0.16;
    orange = totalMms *0.2;
    red = totalMms *0.13;
    yellow = totalMms *0.14;

    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

    double sumTotal;
    sumTotal = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sumTotal);

    if(blue < brown && red >= orange) {
      System.out.println("Blue under Brown and Red over Orange");
    }

    if(brown >= green) {
      System.out.println("Brown is greater than or equal to Green");
    }

    if(totalMms == sumTotal) {
      System.out.println("Numbers match");
    }



    



    



  }
}