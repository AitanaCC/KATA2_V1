package kata2_v1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KATA2_V1{

    public static void main(String[] args) {
        
        int [] data = {1, 2, 9, 8, 6, 3, 7, 1, 8, 1, 2, 7, 8, 6, 7};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<data.length; i++){
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
    
}

