public class Recursion1{

    /* 1 
      Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

      factorial(1) → 1
      factorial(2) → 2
      factorial(3) → 6
    */
    public static int factorial(int n) {	
	if (n==0){ 
	    return 1;
	}
	return factorial(n-1) * n;
    }

    /* 2
       We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

       bunnyEars(0) → 0
       bunnyEars(1) → 2
       bunnyEars(2) → 4
    */

    public static int bunnyEars(int bunnies){
	if (bunnies==0){
	    return 0;
	}
	return bunnyEars(bunnies-1) + 2;
    }


    /* 3
       The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method thqxaat returns the nth fibonacci number, with n=0 representing the start of the sequence.

      fibonacci(0) → 0
      fibonacci(1) → 1
      fibonacci(2) → 1
    */
    public static int fibonacci(int n) {
	if(n==0){return 0;}
	if(n==1){return 1;}
	return fibonacci(n-1) + fibonacci(n-2);
    }
    

    /* 4
      We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

      bunnyEars2(0) → 0
      bunnyEars2(1) → 2
      bunnyEars2(2) → 5
    */
    public static int bunnyEars2(int bunnies) {
	if (bunnies == 0){return 0;}
        if (bunnies%2==0){return bunnyEars2(bunnies-1) + 3;}
	return bunnyEars2(bunnies-1) + 2;
    }


    /* 5
       We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

       triangle(0) → 0
       triangle(1) → 1
       triangle(2) → 3
    */
    public static int triangle(int rows) {
	if (rows == 0){return 0;}
	return triangle(rows-1) + rows;
    }


    /* 6
       Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

       sumDigits(126) → 9
       sumDigits(49) → 13
       sumDigits(12) → 3
    */
    public static int sumDigits(int n) {
	if (n<10){return n;}
	return sumDigits(n/10) + n%10;
    }

    /* 7
       Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

       count7(717) → 2
       count7(7) → 1
       count7(123) → 0
    */
    public static int count7(int n) {
        if (n==0){return 0;}
	if (n%10 == 7){return count7(n/10) + 1;}
	return count7(n/10);
    }

    /* 8
       Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


       count8(8) → 1
       count8(818) → 2
       count8(8818) → 4
    */
    public static int count8(int n) {
	if (n==0){return 0;}
	if (n%100 == 88){return count8(n/10) + 2;}
	if (n%10 == 8){return count8(n/10) + 1;}
	return count8(n/10);
    }

    /* 9
      Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

      powerN(3, 1) → 3
      powerN(3, 2) → 9
      powerN(3, 3) → 27
    */
    public static int powerN(int base, int n) {
	if (n==0){return 1;}
	return base * powerN(base, n-1);
    }

    /* 10
       
       Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

       countX("xxhixx") → 4
       countX("xhixhix") → 3
       countX("hi") → 0
    */
    public static int countX(String str){
	if(str.length() == 0){return 0;}
	if(str.substring(0,1).equals("x")){return 1 + countX(str.substring(1,str.length()));}
	return countX(str.substring(1,str.length()));
    }


    /* 11
	   
       Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

       countHi("xxhixx") → 1
       countHi("xhixhix") → 2
       countHi("hi") → 1
    */
    public static int countHi(String str) {
	if(str.length() < 2){return 0;}
	if(str.substring(0,2).equals("hi")){return 1 + countHi(str.substring(1,str.length()));}
	return countHi(str.substring(1,str.length()));
    }

    /* 12
      Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
     */
    public static String changeXY(String str) {
	if (str.length()<1){return "";}
	if (str.substring(0,1).equals("x")){return "y" + changeXY(str.substring(1,str.length()));}
	return str.substring(0,1) + changeXY(str.substring(1,str.length()));
}

    /* 13
      Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

      changePi("xpix") → "x3.14x"
      changePi("pipi") → "3.143.14"
      changePi("pip") → "3.14p"
     */
    public static String changePi(String str) {
	if (str.length()<2){return str;}
	if (str.substring(0,2).equals("pi")){return "3.14" + changePi(str.substring(2,str.length()));}
	return str.substring(0,1) + changePi(str.substring(1,str.length()));		
}

    /* 14
      Given a string, compute recursively a new string where all the 'x' chars have been removed.

      noX("xaxb") → "ab"
      noX("abc") → "abc"
      noX("xx") → ""
    */
    public static String noX(String str) {
	if (str.length()<1){return "";}
	if (str.substring(0,1).equals("x")){return noX(str.substring(1,str.length()));}
	return str.substring(0,1) + noX(str.substring(1,str.length()));
    }
    /* 15
       Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


       array6([1, 6, 4], 0) → true
       array6([1, 4], 0) → false
       array6([6], 0) → true
    */
    public static boolean array6(int[] nums, int index) {
        if (index == nums.length){return false;}
	if (nums[index] == 6){return true;}
	return array6(nums,index+1);
    }

    /* 16
       Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


       array11([1, 2, 11], 0) → 1
       array11([11, 11], 0) → 2
       array11([1, 2, 3, 4], 0) → 0
    */
    public static int array11(int[] nums, int index) {
	if (index == nums.length){return 0;}
	if (nums[index] == 11){return 1 + array11(nums, index+1);}
	return array11(nums,index+1);
    }

    /* 17
      
      Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


      array220([1, 2, 20], 0) → true
      array220([3, 30], 0) → true
      array220([3], 0) → false
    */
    public static boolean array220(int[] nums, int index) {
	if (index == nums.length-1){return false;}
	if (nums[index] == nums[index+1] * 10){return true;}
	return array220(nums,index+1);
    }

    /* 18
      Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


      allStar("hello") → "h*e*l*l*o"
      allStar("abc") → "a*b*c"
      allStar("ab") → "a*b"
    */
    public String allStar(String str) {
	if (str.length() < 2){return str;}
	return str.substring(0,1) + "*" + allStar(str.substring(1));
    }

    /* 19
       
       Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".


       pairStar("hello") → "hel*lo"
       pairStar("xxyy") → "x*xy*y"
       pairStar("aaaa") → "a*a*a*a"
    */
    public String pairStar(String str) {
	if (str.length() < 2){return str;}
	if (str.substring(0,1).equals(str.substring(1,2))){return str.substring(0,1) + "*" + pairStar(str.substring(1));}
	return str.substring(0,1) + pairStar(str.substring(1));
    }

    /* 20
       Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


       endX("xxre") → "rexx"
       endX("xxhixx") → "hixxxx"
       endX("xhixhix") → "hihixxx"
 
    */
    public String endX(String str) {
        if (str.length()<1){return "";}
	if (str.substring(0,1).equals("x")){return endX(str.substring(1)) + "x";}
	return str.substring(0,1) + endX(str.substring(1));
    }
    /* 21
       We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

       countPairs("axa") → 1
       countPairs("axax") → 2
       countPairs("axbx") → 1
    */
    public int countPairs(String str) {
	if (str.length()<3){return 0;}
	if (str.substring(0,1).equals(str.substring(2,3))){return 1 + countPairs(str.substring(1));}
	return countPairs(str.substring(1));
    }

    /* 22
       Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

       countAbc("abc") → 1
       countAbc("abcxxabc") → 2
       countAbc("abaxxaba") → 2
    */
    public int countAbc(String str) {
        if (str.length()<3){return 0;}
	if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){return 1 + countAbc(str.substring(1));}
	return countAbc(str.substring(1));
}
    /* 23
      Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


      count11("11abc11") → 2
      count11("abc11x11x11") → 3
      count11("111") → 1
    */
    public int count11(String str) {
        if (str.length()<2){return 0;}
	if (str.substring(0,2).equals("11")){return 1 + count11(str.substring(2));}
	return count11(str.substring(1));
    }

    /* 24
      Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".


      stringClean("yyzzza") → "yza"
      stringClean("abbbcdd") → "abcd"
      stringClean("Hello") → "Helo"
    */
    public String stringClean(String str) {
	return "";
    }

    /* 25
      Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


      countHi2("ahixhi") → 1
      countHi2("ahibhi") → 2
      countHi2("xhixhi") → 0
    */
    public int countHi2(String str) {
	if (str.equals("hi")){return 1;}
        if (str.length()<3){return 0;}
	if (str.substring(0,3).equals("xhi")){return countHi2(str.substring(2));}
	if (str.substring(0,2).equals("hi")){return 1 + countHi2(str.substring(1));}
	return countHi2(str.substring(1));
    }

    /* 26
      Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


      parenBit("xyz(abc)123") → "(abc)"
      parenBit("x(hello)") → "(hello)"
      parenBit("(xy)1") → "(xy)"
    */
    public String parenBit(String str) {
	if (str.length()<2){return str;}
	if (str.substring(0,1).equals("(") && str.substring(str.length()-1).equals(")")){return str;}
	if (str.substring(0,1).equals("(")){return parenBit(str.substring(0,str.length()-1));}
	if (str.substring(str.length()-1).equals(")")){return parenBit(str.substring(1));}
	return parenBit(str.substring(1,str.length()-1));
}
    /* 27
       Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.


       nestParen("(())") → true
       nestParen("((()))") → true
       nestParen("(((x))") → false
    */
    public boolean nestParen(String str) {
	if (str.equals(")") || str.equals("(")){return false;}
	if (str.length()<2){return true;}
	if (str.substring(0,1).equals("(") && str.substring(str.length()-1).equals(")")){return nestParen(str.substring(1,str.length()-1));}
	return false;
    }

    /* 28
      Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

      strCount("catcowcat", "cat") → 2
      strCount("catcowcat", "cow") → 1
      strCount("catcowcat", "dog") → 0
    */
    public static int strCount(String str, String sub) {
	if (str.length()<sub.length()){return 0;}
	if (str.substring(0,sub.length()).equals(sub)){return 1 + strCount(str.substring(sub.length(),str.length()),sub);}
	return strCount(str.substring(1,str.length()),sub);
}

    /* 29
       Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.


       strCopies("catcowcat", "cat", 2) → true
       strCopies("catcowcat", "cow", 2) → false
       strCopies("catcowcat", "cow", 1) → true
    */
    public boolean strCopies(String str, String sub, int n) {
	return true;
    }

    /* 30
       Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


       strDist("catcowcat", "cat") → 9
       strDist("catcowcat", "cow") → 3
       strDist("cccatcowcatxx", "cat") → 9
    */
    public int strDist(String str, String sub) {
	if (str.length()< sub.length()){return 0;}
	if (str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub)){return str.length();}
	if (str.substring(0,sub.length()).equals(sub)){return strDist(str.substring(0,str.length()-1));}
	if (str.substring(str.length()-sub.length()).equals(sub)){return strDist(str.substring(sub.length()));}
	return strDist(str.substring(1,str.length()-1));
	
    }
    
    public static void main(String[] args){
	System.out.println("---------factorial-----------");
	System.out.println(factorial(1));
	System.out.println(factorial(2));
	System.out.println(factorial(3));
	System.out.println(factorial(4));
	System.out.println(factorial(5));
	System.out.println(factorial(6));
	System.out.println(factorial(7));
	System.out.println(factorial(8));
	System.out.println(factorial(12));

	System.out.println("-----------bunnyEars------------");
	System.out.println(bunnyEars(0));
	System.out.println(bunnyEars(1));
	System.out.println(bunnyEars(2));
	System.out.println(bunnyEars(3));
	System.out.println(bunnyEars(4));
	System.out.println(bunnyEars(5));
	System.out.println(bunnyEars(12));
	System.out.println(bunnyEars(50));
	System.out.println(bunnyEars(264));
	
	System.out.println("-----------fibonacci------------");
	System.out.println(fibonacci(0));
	System.out.println(fibonacci(1));
	System.out.println(fibonacci(2));
	System.out.println(fibonacci(3));
	System.out.println(fibonacci(4));
	System.out.println(fibonacci(5));
       	System.out.println(fibonacci(6));
       	System.out.println(fibonacci(7));

	System.out.println("-----------bunnyEars2------------");
	System.out.println(bunnyEars2(0));
	System.out.println(bunnyEars2(1));
       	System.out.println(bunnyEars2(2));
       	System.out.println(bunnyEars2(3));
       	System.out.println(bunnyEars2(4));
       	System.out.println(bunnyEars2(5));
       	System.out.println(bunnyEars2(6));
       	System.out.println(bunnyEars2(10));
	
	System.out.println("-----------triangle------------");	
	System.out.println(triangle(0));
       	System.out.println(triangle(1));
       	System.out.println(triangle(2));
       	System.out.println(triangle(3));
       	System.out.println(triangle(4));
       	System.out.println(triangle(5));
       	System.out.println(triangle(6));
       	System.out.println(triangle(7));

      	System.out.println("-----------sumDigits------------");
	System.out.println(sumDigits(126));
	System.out.println(sumDigits(49));
	System.out.println(sumDigits(12));
	System.out.println(sumDigits(10));
	System.out.println(sumDigits(1));
	System.out.println(sumDigits(0));
	System.out.println(sumDigits(730));
	System.out.println(sumDigits(1111));
	System.out.println(sumDigits(11111));
	System.out.println(sumDigits(10110));
	System.out.println(sumDigits(235));

	System.out.println("-----------count7------------");
	System.out.println(count7(717));
	System.out.println(count7(7));
	System.out.println(count7(123));
	System.out.println(count7(77));
	System.out.println(count7(7123));
	System.out.println(count7(771237));
	System.out.println(count7(771737));
	System.out.println(count7(47571));
	System.out.println(count7(777777));
	System.out.println(count7(70701277));
	System.out.println(count7(777576197));
	System.out.println(count7(99999));
	System.out.println(count7(99799));

	System.out.println("-----------count8------------");
	System.out.println(count8(8));
	System.out.println(count8(818));
	System.out.println(count8(8818));
	System.out.println(count8(8088));
	System.out.println(count8(123));
	System.out.println(count8(81238));
	System.out.println(count8(88788));
	System.out.println(count8(8234));
	System.out.println(count8(2348));
	System.out.println(count8(23884));
	System.out.println(count8(0));
	System.out.println(count8(1818188));
	System.out.println(count8(8818181));
	System.out.println(count8(1080));
	System.out.println(count8(188));
	System.out.println(count8(88888));
	System.out.println(count8(9898));
	System.out.println(count8(78));

    	System.out.println("-----------powerN------------");
	System.out.println(powerN(3,1));
	System.out.println(powerN(3,2));
	System.out.println(powerN(3,3));
	System.out.println(powerN(2,1));
	System.out.println(powerN(2,2));
	System.out.println(powerN(2,3));
	System.out.println(powerN(2,4));
	System.out.println(powerN(2,5));
	System.out.println(powerN(10,1));
	System.out.println(powerN(10,2));
	System.out.println(powerN(10,3));

	System.out.println("-----------countX------------");
	System.out.println(countX("xxhixx"));
	System.out.println(countX("xhixhix"));
	System.out.println(countX("hi"));
	System.out.println(countX("h"));
	System.out.println(countX("x"));
	System.out.println(countX(""));
	System.out.println(countX("hihi"));
	System.out.println(countX("hiAAhi12hi"));

	System.out.println("-----------countHi------------");
	System.out.println(countHi("xxhixx"));
	System.out.println(countHi("xhixhix"));
	System.out.println(countHi("hi"));
	System.out.println(countHi("hihih"));
	System.out.println(countHi("h"));
	System.out.println(countHi(""));
	System.out.println(countHi("ihihihihih"));
	System.out.println(countHi("ihihihihihi"));
	System.out.println(countHi("hiAAhi12hi"));
	System.out.println(countHi("xhixhxihihhhih"));
	System.out.println(countHi("ship"));

	System.out.println("-----------changeXY------------");
	System.out.println(changeXY("codex"));
	System.out.println(changeXY("xxhixx"));
	System.out.println(changeXY("xhixhix"));
	System.out.println(changeXY("hiy"));
	System.out.println(changeXY("h"));
	System.out.println(changeXY("x"));
	System.out.println(changeXY(""));
	System.out.println(changeXY("xxx"));
	System.out.println(changeXY("yyhxyi"));
	System.out.println(changeXY("hihi"));

	System.out.println("-----------strCount------------");
	System.out.println(strCount("catcowcat", "cat"));
	System.out.println(strCount("catcowcat", "cow"));
	System.out.println(strCount("catcowcat", "dog"));
	System.out.println(strCount("cacatcowcat", "cat"));
	System.out.println(strCount("xyx", "x"));
	System.out.println(strCount("iiiijj", "i"));
	System.out.println(strCount("iiiijj", "ii"));
	System.out.println(strCount("iiiijj", "iii"));
	System.out.println(strCount("iiiijj", "j"));
	System.out.println(strCount("iiiijj", "jj"));
	System.out.println(strCount("aaabababab", "ab"));
	System.out.println(strCount("aaabababab", "aa"));
	System.out.println(strCount("aaabababab", "a"));
	System.out.println(strCount("aaabababab", "b"));

	System.out.println("-----------changePi------------");
	System.out.println(changePi("xpix"));
	System.out.println(changePi("pipi"));
	System.out.println(changePi("pip"));
	System.out.println(changePi("pi"));
	System.out.println(changePi("hip"));
	System.out.println(changePi("p"));
	System.out.println(changePi("x"));
	System.out.println(changePi(""));
	System.out.println(changePi("pixx"));
	System.out.println(changePi("xyzzy"));

	System.out.println("-----------noX------------");
	System.out.println(noX("xaxb"));
       	System.out.println(noX("abc"));
       	System.out.println(noX("xx"));
       	System.out.println(noX(""));
       	System.out.println(noX("axxbxx"));
	System.out.println(noX("Hellox"));

	System.out.println("-----------array6------------");
	int[] a = {1, 6, 4};
	int[] b = {1, 4};
	System.out.println(array6(a, 0));
       	System.out.println(array6(b, 0));

	System.out.println("-----------array11------------");
	int[] c = {1, 2, 11};
	int[] d = {11,11};
	System.out.println(array11(c, 0));
       	System.out.println(array11(d, 0));
     
	
    }
}
