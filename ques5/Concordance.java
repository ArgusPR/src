package ques5;

import java.util.*;

public class Concordance {
        private static Map<Character, Set<Integer>> characterConcordance(final String input) {

            Map<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();

            for (int i = 0; i < input.length(); i++) {
                char charAt = input.charAt(i);
                if (charAt == ' ') {
                    continue; // ignore spaces
                }
                Set<Integer> set= concordance.get(charAt);
                if (set == null) {
                    set= new HashSet<Integer>();
                }
                set.add(i); // use i for 0-indexed, or (i+1) for 1-indexed positions
                concordance.put(charAt, set);
            }

            return concordance;
        }

        public static void main(final String[] args) {

            System.out.println(Concordance.characterConcordance("HelloWorld"));
        }
}

