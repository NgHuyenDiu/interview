/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Huyen Diu
 */
public class Ex2 {

    public static void main(String[] args) {
        Solution list = new Solution();
        String result = list.solution(new String[]{"sander", "amy", "ann", "michael"}, new String[]{"123456789", "234567890", "789123456", "123123123"}, "1");
        System.out.println("result = " + result);
    }

}
