class Main {

public static void main(String[] args) {

  int height = 4;

    for (int i = 1; i<=height; i++)
    {
      for (int j = height; j>=i; j--)System.out.print(" ");
      for (int j = i; j>0; j--)System.out.print("*");
      System.out.println(" ");
    }

    for (int i = 1; i<=height; i++)
    {
    System.out.print("    ");
    for (int j = 1; j<=i; j++)System.out.print("*");
    System.out.println(" ");
    }

    for (int i = 1; i<=height; i++)
    {
      for (int j = height; j>=i; j--)System.out.print(" ");
      for (int j = i; j>0; j--)System.out.print("*");
      System.out.println(" ");
    }
    for (int i = 1; i<=height; i++)
    {
    System.out.print("    ");
    for (int j = 1; j<=i; j++)System.out.print("*");
    System.out.println(" ");
    }
  }
}