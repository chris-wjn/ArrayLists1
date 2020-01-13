import java.util.ArrayList;
import java.util.Collections;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int s = nums.get(i);
            if (s < maxValue) maxValue = s;
        }
        nums.remove(nums.indexOf(maxValue));
        //int i = Collections.min(nums);
        //nums.remove(nums.indexOf(i));
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
