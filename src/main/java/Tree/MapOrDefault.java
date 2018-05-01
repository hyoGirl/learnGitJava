package Tree;

import java.util.HashMap;
import java.util.Map;

public class MapOrDefault {

    public static void main(String[] args) {

        Map map=countCharacter("ilssejavajavascripts");
        System.out.println(map);


    }

    public static Map countCharacter(String str){

        Map<Character,Integer> result=new HashMap<Character,Integer> ();
        for(char c:str.toCharArray()){

                //把key作为字节，value作为出现的次数。
            if(!result.containsKey(c)){
                result.put(c,1);
            }else{
                result.put(c,result.get(c)+1);

            }

           // result.put(c,result.getOrDefault(c,0)+1);

        }

        return result;
    }

}
