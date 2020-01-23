public class PrintMe {

  public static void main(String[] args) {

    // print that for loop was used
    System.out.println(" ");
    System.out.println("Using for loop \n");

    // evaluate the numbers 0 through 9
    for (int i = 0; i < 10; i++) {

      // determine and print whether i is even or odd
      if (i % 2 == 0)
        System.out.println(i + " is even");
      else
        System.out.println(i + " is odd");

    }

    // print that while loop was used
    System.out.println(" ");
    System.out.println("Using while loop \n");

    // initialize count variable for loop
    int count = 0;

    // evaluate the numbers 0 through 9
    while (count < 10) {

      // determine and print whether count is even or odd
      if (count % 2 == 0)
        System.out.println(count + " is even");
      else
        System.out.println(count + " is odd");

      // prevent infinite loop
      count++;

    }

  }

}
