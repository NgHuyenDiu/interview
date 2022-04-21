/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.util.TreeSet;

/**
 *
 * @author Huyen Diu
 */
public class Solution {

    public String solution(String[] A, String[] B, String P) {

        TreeSet<String> sortedContacts = new TreeSet<>();
        for (int i = 0; i < B.length; i++) {
            if (B[i].contains(P)) {
                sortedContacts.add(A[i]);
            }
        }

        return sortedContacts.isEmpty() ? "NO CONTACT" : sortedContacts.first();
    }
}
