// import java.math.BigInteger;
// import java.util.*;

// public class STTwo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int t = input.nextInt();
//         input.nextLine();

//         while(t-- > 0)
//         {
//             String str = input.nextLine();
//             String[] words = str.split("\\s+");
//             StringBuilder ans = new StringBuilder();

//             for(int i=words.length-1;i>=0;i--) {
//                 ans.append(words[i]).append(" ");
//             }

//             String answer = ans.toString().trim();
//             System.out.println(answer);
//         }

//         input.close();
//     }
// }

// 6. Add Binary 

// public class STTwo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int t = input.nextInt();
//         input.nextLine();

//         while(t-- > 0)
//         {
//             String a = input.nextLine();
//             String b = input.nextLine();

//             String ans = addBinary(a,b);
//             System.out.println(ans);
//         }
//         input.close();
//     }

//     public static String addBinary(String a, String b) {
//         StringBuilder ans = new StringBuilder();
//         int index1 = a.length()-1;
//         int index2 = b.length()-1;
//         int carry = 0;

//         while(index1>=0 || index2>= 0 || carry > 0)
//         {
//             int num1 = index1>=0 ? a.charAt(index1)-'0' : 0;
//             int num2 = index2>=0 ? b.charAt(index2)-'0' : 0;

//             int sum = num1 + num2 + carry;
//             ans.append(sum%2==0 ? "0":"1");
//             carry = sum>1 ? 1 : 0;
//             // if(sum==3) {
//             //     ans.append("1");
//             //     carry = 1;
//             // }
//             // else if(sum==2) {
//             //     ans.append("0");
//             //     carry = 1;
//             // }
//             // else if(sum==1) {
//             //     ans.append("1");
//             //     carry = 0;
//             // }
//             // else if(sum==0) {
//             //     ans.append("0");
//             //     carry = 0;
//             // }
//             index1--;
//             index2--;
//         }
//         return ans.reverse().toString();
//     }
// }

// 7. Multiply Strings 
// public class STTwo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int t = input.nextInt();
//         input.nextLine();

//         while(t-- > 0)
//         {
//             String a = input.nextLine();
//             String b = input.nextLine();

//             BigInteger num1 = new BigInteger(a);
//             BigInteger num2 = new BigInteger(b);

//             BigInteger ans = num1.multiply(num2);

//             System.out.println(ans.toString());
//         }

//         input.close();
//     }
// }

// 8. Student Attence Record I 
// class Solution {
//     public boolean checkRecord(String s) {
//         int late = 0;
//         int absent = 0;

//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)=='L') {
//                 late++;
//                 if(late==3) return false;
//             }
//             else if(s.charAt(i)=='A') {
//                 absent++;
//                 late = 0;
//                 if(absent==2) return false;
//             }
//             else {
//                 late = 0;
//             }
//         }

//         return true;
//     }
// }