package contest54;

import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
public class degreeOfAnyArray {
    public static void main(String[] args) {
        new degreeOfAnyArray().run();
    }
    public void run(){
        int[] nums={1, 2, 2, 3, 1};
        System.out.println(findShortestSubarray(nums));
    }
    public int findShortestSubarray(int[] nums){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        //遍历存frequency
        for (int num:nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        //找出degree的值并存起相应key值
        int max=0;
        LinkedList<Integer> maxKeys=new LinkedList<>();
        for (int counts:map.values()){
            if(counts>max){
                max=counts;
            }
        }
        for (int key:map.keySet()){
            if (map.get(key)==max){
                maxKeys.add(key);
            }
        }

        //找出最小长度
        HashMap<Integer,Integer> minimalLength=new HashMap<Integer,Integer>();
        for (int maxKey:maxKeys) {
            int counts=0;
            int firstIndex=0;
            int lastIndex=0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == maxKey) {
                    counts++;
                    if (counts == 1) {
                        firstIndex = i;
                    }
                    if (counts == max) {
                        lastIndex = i;
                        break;
                    }
                }
            }
            minimalLength.put(maxKey,lastIndex-firstIndex+1);
        }
        int min=nums.length;
        for (int value:minimalLength.values()){
            if (value<min){
                min=value;
            }
        }
        return min;
    }
}
