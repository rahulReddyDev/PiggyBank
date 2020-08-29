public class PiggyBankTester {

  /**
   * 
   * Checks whether PiggyBank.getCoinName() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean getCoinNameTestMethod() {

    // consider all coin values as input arguments

    for (int i = 0; i < PiggyBank.COINS_VALUES.length; i++)

      if (!PiggyBank.getCoinName(PiggyBank.COINS_VALUES[i]).equals(PiggyBank.COINS_NAMES[i]))

        return false;

    // consider input argument which does not correspond to a coin value

    if (!PiggyBank.getCoinName(7).equals(PiggyBank.NO_SUCH_COIN))

      return false;

    if (!PiggyBank.getCoinName(-10).equals(PiggyBank.NO_SUCH_COIN))

      return false;

    return true;

  }

  /**
   * 
   * Checks whether PiggyBank.getBalance() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean getBalanceTestMethod() {

    // scenario 1 - empty piggy bank

    int[] coins = new int[10]; // array storing the coins held in a piggy bank

    int size = 0; // number of coins held in coins array

    if (PiggyBank.getBalance(coins, size) != 0) {

      System.out.println("Problem detected. Your PiggyBank.getBalance() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 2 - non empty piggy bank

    coins = new int[] {10, 1, 5, 25, 1, 0, 0};

    size = 5;

    if (PiggyBank.getBalance(coins, size) != 42) {

      System.out.println("Problem detected. Your PiggyBank.getBalance() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 3 - another non empty piggy bank

    coins = new int[] {10, 1, 5, 25, 1, 0};

    size = 3;

    if (PiggyBank.getBalance(coins, size) != 16) {

      System.out.println("Problem detected. Your PiggyBank.getBalance() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    return true;

  }

  /**
   * 
   * Checks whether PiggyBank.getBalance() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean getSpecificCoinCountTestMethod() {

    // scenario 1 - empty piggy bank

    int[] coins = new int[10]; // array storing the coins held in a piggy bank

    int size = 0; // number of coins held in coins array

    if (PiggyBank.getSpecificCoinCount(25, coins, size) != 0) {

      System.out.println("Problem detected. Your PiggyBank.getBalance() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 2 - non empty piggy bank

    coins = new int[] {10, 10, 5, 25, 1, 0, 0};

    size = 5;

    if (PiggyBank.getSpecificCoinCount(10, coins, size) != 2) {

      System.out.println("Problem detected. Your PiggyBank.getBalance() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 3 - non empty piggy bank

    coins = new int[] {5, 5, 5, 25, 1, 0};

    size = 4;

    if (PiggyBank.getSpecificCoinCount(5, coins, size) != 3) {

      System.out.println("Problem detected. Your PiggyBank.getBalance() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }



    return true;



  }

  /**
   * 
   * Checks whether PiggyBank.addCoin() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */



  public static boolean addCoinTestMethod() {

    // scenario 1 - adding vaid currency.

    int[] coins = new int[10];// array storing the coins held in a piggy bank

    int size = 5;// number of coins held in coins array

    if (PiggyBank.addCoin(5, coins, size) != 6) {

      System.out.println("Problem detected. Your PiggyBank.addCoin() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 2 - piggy bank is full.

    coins = new int[] {10, 5, 10, 25, 1};

    size = 5;

    if (PiggyBank.addCoin(5, coins, size) != 5) {

      System.out.println("Problem detected. Your PiggyBank.addCoin() did not ");

      return false;

    }

    // scenario 3 - adding non - valid currency.

    coins = new int[] {5, 10, 25, 1, 5};// array storing the coins held in a piggy bank

    size = 6;// number of coins held in coins array

    if (PiggyBank.addCoin(7, coins, size) != 6) {

      System.out.println("Problem detected. Your PiggyBank.addCoin() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }



    return true;

  }

  /**
   * 
   * Checks whether PiggyBank.removeCoin() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean removeCoinTestMethod() {

    // scenario 1- empty piggy bank

    int[] coins = new int[10];

    int size = 0;

    if (PiggyBank.removeCoin(coins, size) != 0) {

      System.out.println("Problem detected. Your PiggyBank.removeCoin() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 2- non-empty piggy bank

    coins = new int[] {10, 5, 25, 5, 1};

    size = 5;

    if (PiggyBank.removeCoin(coins, size) != 4) {

      System.out.println("Problem detected. Your PiggyBank.removeCoin() did not "

              + "return the expected output when passed to a non empty piggy bank.");

      return false;

    }

    return true;

  }

  /**
   * 
   * Checks whether PiggyBank.emptyPiggyBank() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */

  public static boolean emptyPiggyBankTestMethod() {

    // scenario 1- empty piggy bank

    int[] coins = new int[10];

    int size = 0;

    if (PiggyBank.emptyPiggyBank(coins, size) != 0) {

      System.out.println("Problem detected. Your PiggyBank.removeCoin() did not "

              + "return the expected output when passed an empty piggy bank.");

      return false;

    }

    // scenario 2 - non-empty piggy bank

    coins = new int[] {10, 25, 5, 1, 25};

    size = 5;

    if (PiggyBank.emptyPiggyBank(coins, size) != 0) {

      System.out.println("Problem detected. Your PiggyBank.removeCoin() did not "

              + "return the expected output when passed to a non empty piggy bank.");

      return false;

    }



    return true;

  }

  /**
   * 
   * Checks whether PiggyBank.withdraw() method works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   * 
   */



  /**
   * 
   * Calls the test methods implemented in this class and displays their output
   * 
   * @param args input arguments if any
   * 
   */

  public static void main(String[] args) {

    System.out.println("getCoinNameTest(): " + getCoinNameTestMethod());

    System.out.println("getBalanceTest(): " + getBalanceTestMethod());

    System.out.println("getSpecificCoinCount(): " + getSpecificCoinCountTestMethod());

    System.out.println("addCoin(): " + addCoinTestMethod());

    System.out.println("removeCoin(): " + addCoinTestMethod());

    System.out.println("emptyPiggyBank():" + emptyPiggyBankTestMethod());

  }

}

