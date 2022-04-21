/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author Huyen Diu
 */
public class Solution {
      public int solution(String s)
    {    
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum += s.charAt(i) - 48;
        }
        
        int count = 0;
        if (sum % 3 == 0)
            count++;
        
        for (int i = 0; i < s.length(); ++i) {
            int remaining_sum
                = sum - (s.charAt(i) - 48);
 
            for (int j = 0; j <= 9; ++j) {
                if ((remaining_sum + j) % 3 == 0 && j != s.charAt(i) - 48) {
                    ++count;
                }
            }
        }
        return count;
    }
}
