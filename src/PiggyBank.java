import java.util.Random;



public class PiggyBank {

  public final static int[] COINS_VALUES = {1, 5, 10, 25};

  // coins values in cents

  // coins names

  public final static String[] COINS_NAMES = {"PENNY", "NICKEL", "DIME", "QUARTER"};

  public final static String NO_SUCH_COIN = "N/A";

  // N/A string

  private final static Random RAND_GEN = new Random(100);

  // generator of random integers



  /**
   * 
   * Returns the name of a specified coin value
   * 
   * 
   * 
   * @param coin represents a coin value in cents.
   * 
   * @return the String name of a specified coin value if it is valid and N/A if
   * 
   *         the * coin value is not valid
   * 
   */

  public static String getCoinName(int coin) {

    for (int i = 0; i < COINS_VALUES.length; i++) {

      if (COINS_VALUES[i] == coin) {

        return COINS_NAMES[i];

      } else

        continue;

    }

    return NO_SUCH_COIN;

  }



  /**
   * 
   * Returns the balance of a piggy bank in cents
   * 
   * 
   * 
   * @param coins an oversize array which contains all the coins held in a piggy
   * 
   *              bank
   * 
   * @param size  the total number of coins stored in coins array
   * 
   * @return the total value of the coins held in a piggy bank in cents
   * 
   */

  public static int getBalance(int[] coins, int size) {

    int balance = 0;

    for (int i = 0; i < size; i++) {

      balance = balance + coins[i];

    }

    return balance;

  }



  /**
   * 
   * Returns the total number of coins of a specific coin value held in a piggy
   * 
   * bank *
   * 
   * 
   * 
   * @param coinValue the value of a specific coin
   * 
   * @param coins     an oversize array which contains all the coins held in a
   * 
   *                  piggy bank
   * 
   * @param size      the total number of coins stored in coins array
   * 
   * @return the number of coins of value coinValue stored in the array coins
   * 
   */

  public static int getSpecificCoinCount(int coinValue, int[] coins, int size) {

    int count = 0;

    for (int i = 0; i < size; i++) {

      if (coins[i] == coinValue) {

        count++;

      }

    }

    return count;

  }



  /**
   * 
   * Displays information about the content of a piggy bank
   *
   * 
   * 
   * @param coins an oversize array storing the coins held in a piggy bank
   * 
   * @param size  number of coin held array coins
   * 
   */

  public static void printPiggyBank(int[] coins, int size) {

    System.out.println("QUARTERS: " + getSpecificCoinCount(COINS_VALUES[3], coins, size));

    System.out.println("DIMES: " + getSpecificCoinCount(COINS_VALUES[2], coins, size));

    System.out.println("NICKELS: " + getSpecificCoinCount(COINS_VALUES[1], coins, size));

    System.out.println("PENNIES: " + getSpecificCoinCount(COINS_VALUES[0], coins, size));

    System.out.println("Balance: $" + getBalance(coins, size) * 0.01);

  }



  /**
   * 
   * Adds a given coin to a piggy bank. This operation can terminate successfully
   * 
   * or unsuccessfully. For either cases, this method displays a descriptive
   * 
   * message for either cases.
   *
   * 
   * 
   * @param coin  the coin value in cents to be added to the array coins
   * 
   * @param coins an oversize array storing the coins held in a piggy bank
   * 
   * @param size  the total number of coins contained in the array coins before
   * 
   *              this addCoin method is called.
   * 
   * @return the new size of the coins array after trying to add coin.
   * 
   */

  public static int addCoin(int coin, int[] coins, int size) {

    if (getCoinName(coin).equals(NO_SUCH_COIN)) {

      System.out.println(coin + " cents is not a valid US currency coin.");

      return size;

    }

    if (size == coins.length) {

      System.out.println("Tried to add a " + getCoinName(coin)

              + ", but could not because the piggy bank is full.");

      return size;

    } else {

      coins[size] = coin;

      size = size + 1;

      System.out.println("Added a " + getCoinName(coin) + ".");

      return size;



    }

  }



  /**
   * 
   * Removes an arbitrary coin from a piggy bank. This method may terminate
   * 
   * successfully or unsuccessfully. In either cases, a descriptive message is
   * 
   * displayed.
   *
   * 
   * 
   * @param coins an oversize array which contains the coins held in a piggy bank
   * 
   *              *
   * 
   * @param size  the number of coins held in the coins array before this method
   * 
   *              is called
   * 
   * @return the size of coins array after this method returns successfully
   * 
   */

  public static int removeCoin(int[] coins, int size) {

    if (size == 0) {

      System.out.println(

              "Tried to remove a coin, but could not because the piggy bank is empty.");

      return 0;

    } else {

      int removeCoin = RAND_GEN.nextInt(size);

      coins[removeCoin] = 0;

      for (int i = removeCoin; i < size + 1; i++) {

        coins[i] = coins[i + 1];

      }

      size = size - 1;

      return size;

    }

  }



  /**
   * 
   * Removes all the coins in a piggy bank. It also displays the total value of
   * 
   * the removed coins
   *
   * 
   * 
   * @param coins an oversize array storing the coins held in a piggy bank
   * 
   *              application *
   * 
   * @param size  number of coins held in coins array before this method is called
   * 
   * @return the new size of the piggy bank after removing all its coins.
   * 
   */

  public static int emptyPiggyBank(int[] coins, int size) {

    if (size == 0) {

      System.out.println("Zero coin removed. The piggy bank is already empty.");

      return 0;

    }

    for (int i = 0; i < size; i++) {

      coins[i] = 0;

    }

    size = 0;

    return 0;

  }



  /**
   * 
   * Removes the least number of coins needed to fulfill a withdrawal request
   *
   * 
   * 
   * @param amount amount to withdraw given in cents
   * 
   * @param coins  an oversize array storing the coins held in a piggy bank
   * 
   * @param size   number of coins stored in coins array before this method is
   * 
   *               called
   * 
   * @return perfect size array of 5 elements, index 0 stores the new size of the
   * 
   *         piggy bank after this method returns. Indexes 1, 2, 3, and 4 store
   * 
   *         respectively the number of removed quarters, dimes, nickels, and
   * 
   *         pennies.
   * 
   */

  public static int[] withdraw(int amount, int[] coins, int size) {



    int quaters = getSpecificCoinCount(25, coins, size);

    int dimes = getSpecificCoinCount(10, coins, size);

    int nickels = getSpecificCoinCount(5, coins, size);

    int pennies = getSpecificCoinCount(1, coins, size);



    int[] ret = new int[5];



    // remove max 25 coins

    int temp = quaters < amount / 25.0 ? quaters : (amount + amount % 25) / 25;

    amount -= temp * 25;

    ret[1] = temp;

    temp = 0;



    // remove max 10 coins

    if (amount > 0) {

      temp = dimes < amount / 10.0 ? dimes : (amount + amount % 10) / 10;

      amount -= temp * 10;

    }



    ret[2] = temp;

    temp = 0;



    // remove max 5 coins



    if (amount > 0) {

      temp = nickels < amount / 5.0 ? nickels : (amount + amount % 5) / 5;

      amount -= temp * 5;

    }



    ret[3] = temp;

    temp = 0;



    // remove max 1 coins



    if (amount > 0) {

      temp = pennies < amount / 1.0 ? pennies : (amount + amount % 1) / 1;

      amount -= temp * 1;

    }



    ret[4] = temp;

    ret[0] = size - (ret[1] + ret[2] + ret[3] + ret[4]);

    return ret;



  }



  public static void main(String[] args) {

    // TODO Auto-generated method stub



  }



}

