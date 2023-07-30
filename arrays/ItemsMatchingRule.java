//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//
//        The ith item is said to match the rule if one of the following is true:
//
//        ruleKey == "type" and ruleValue == typei.
//        ruleKey == "color" and ruleValue == colori.
//        ruleKey == "name" and ruleValue == namei.
//
//        Return the number of items that match the given rule.
//
//
//
//        Example 1:
//
//        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

import java.util.ArrayList;
import java.util.List;

public class ItemsMatchingRule {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        //items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]];
        String ruleKey = "color", ruleValue = "silver";

        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = -1,count =0 ;


        //cases to check which ruleKey we got and change index accordingly
        switch(ruleKey){
            case "type" -> index = 0;
            case "color" -> index = 1;
            case "name" -> index = 2;
            //default -> index = -1;
            default -> throw new IllegalStateException("Unexpected value: " + ruleKey);
        }

        //loop through the second list, and check keyValue
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }

        return count;

    }
}
