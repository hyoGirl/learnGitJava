package CodeString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxChar {

    public static void main(String[] args) {


        String test="acacadbdbfbeegg";

        //找出出现次数最多的。
        Integer max=0;
        char[] chars = test.toCharArray();
        Map<Character,Integer> result=new HashMap<Character, Integer>();
        for (int i = 0; i <chars.length ; i++) {

             Integer count=   result.get(chars[i]);

             count=count==null?1:++count;

             result.put(chars[i],count);

             if(count >max){
                 max=count;
             }
        }
        //1:先找出出现最多的次数，
        //2：再找出每个元素的次数，如果等于最多的次数，就放入到新map中。或者打印出来。
        Set<Character> keySet = result.keySet();

        for(Character c:keySet){

            if(result.get(c).compareTo(max)==0){
                System.out.println("出现最多次数的次数是： "+max);
                System.out.println("出现最多次数的元素是： "+c);

            }
        }

    }

}
