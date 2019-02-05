public class ISBN {
  
  public static void main(String[] args) {
    
    /*
     NEYIR ERDESER 260736004
     */
    
    //Declaring the variable to represent the ISBN number
    int n = Integer.parseInt(args[0]);
    
    // digits (5432 as example, d5 being 5, d4 being 4 etc.)
    // i'm keeping the example calculation for easier understanding
    // 5432/1000 = 5 <-- d5
    int d5 = n/1000;
    // 5432/100 = 54 - (50) = 4 <-- d4
    int d4 = n/100 - (d5*10);
    // 5432/10 = 543 - (540) = 3 <--d3
    int d3 = n/10 - (d5*100 + d4*10);
    // 5432 = 5432 - (5430) = 2 <--d2
    int d2 = n - (d5*1000 + d4*100 + d3*10);
    int d1; // we want to find this one (d1)
    
    // multiply digits by their digit numbers
    // d_i <-- d_i * i
    d5*=5;
    d4*=4;
    d3*=3;
    d2*=2;
    // d1 will stay as d1 since the value is multiplied by 1.
    
    // add the new values together
    int sum = d5 + d4 + d3 + d2;
    
    // this will help determine where we are with the result
    // as a sum of both 67 and 76 will give 6 as result
    // and both need to be increased to 77, which is (result+1)*11.
    int result = sum/11;
    int remain = sum%11;
    
    // this will be the desired result,the next number that's a factor of 11
    // if the remainder is 0, it means that the number is already divisible by 11 and the sum is already the goal.
    // so we start by that
    int goal = sum;
    // if the remainder is not 0, then we need to take the next number thats divisible by 11 as goal.
    if (remain != 0) {
      goal = (result+1)*11;
    }
    // the difference between the goal and the current sum will be the last digit
    d1 = goal - sum;
    // output
    if (d1 == 10)
      System.out.println("X");
    else
      System.out.println(d1);
  }
  
}