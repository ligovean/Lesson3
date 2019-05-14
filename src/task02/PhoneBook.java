package task02;

import java.util.*;

public class PhoneBook {
    private Map<String,String> phoneBookMap = new HashMap<String,String>();

    public void add(String pNum, String name){
        if (phoneBookMap.get(pNum) == null)
            phoneBookMap.put(pNum, name);
    }

    public String get(String name){
        String pNums = "";

        for (String phNum:phoneBookMap.keySet()){
            if (phoneBookMap.get(phNum).equals(name)){
                if (pNums != "")
                    pNums += "," + phNum;
                else
                    pNums = phNum;
            }
        }
        return pNums;
    }
}
