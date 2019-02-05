public class JudgeScore {
  
 public static void main(String[] args) {
 
  /*
  NEYIR ERDESER 260736004
  */ 
 
  //Declaring the variables for storing the judges scores.
  int judge1, judge2, judge3, judge4;
  judge1 = Integer.valueOf(args[0]);
  judge2 = Integer.valueOf(args[1]);
  judge3 = Integer.valueOf(args[2]);
  judge4 = Integer.valueOf(args[3]);
  
  // add all the scores together to be modified later
  int sum = judge1 + judge2 + judge3 + judge4;
  
  // find the highest score starting from judge1
  // the integer "highest" will hold the higest score found upto that point
  // it will start by the first score and change value by comparing the next score to the one it's holding.
  // at the end of next 7 lines the value the integer "highest" holds will be the highest value
  int highest = judge1;
  if (judge2 > highest)
    highest = judge2;
  if (judge3 > highest)
    highest = judge3;
  if (judge4 > highest)
    highest = judge4;
  // find the lowest the same way
  int lowest = judge1;
  if (judge2 < lowest)
    lowest = judge2;
  if (judge3 < lowest)
    lowest = judge3;
  if (judge4 < lowest)
    lowest = judge4;
  
  // take the highest and lowest scores out of the sum
  // this will leave the sum with only the two scores that weren't the highest or the lowest
  // this way we prevent the code from removing multiple scores at once incase of same scores given by the judges
  // as in the scores 3 5 7 7 wont be taken as 5 but will be 5 and 7.
  sum-=highest;
  sum-=lowest;
  
  // take the average of the left scores
  // using 2.0 to get the double result if the calculation
  // otherwise it would be an integer that later get a .0 added at the end whilest being assigned to a double
  double average = sum/2.0;
  // output
  System.out.println(average);
 }
 
}
