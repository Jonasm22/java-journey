package L_MapCollection;

import java.util.HashMap;

public class ExampleHashMap {

    public static void main(String[] args) {
    stock();
    }



    public static void students(){
        //Map for students and records
        HashMap<String, Integer> records = new HashMap<>();


        //add data
        records.put("Alice", 20);
        records.put("Lucas", 10);
        records.put("Mario", 8);


        //Search record from a stundets

        String name = "Lucas";
        if(records.containsValue(10)){
            System.out.println(name + " Has a record of " + records.get(name));
        }else{
            System.out.println("Student does not exist");
        }
    }

    public static void numbers(){
        int[] numbers = {2,4,5,7,8,9,7,2,4};

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num : numbers){
          if(count.containsKey(num)){
              count.put(num, count.get(num) + 1);
          }else {
              count.put(num, 1);
          }

        }

        for(int pass : count.keySet()){
            System.out.println("Numbers: " + pass + " appears: " + count.get(pass));
        }

    }

    public static void  twoPointers(){

        int[] nums = {1, 2, 3, 5, 6, 7, 9};
        int target = 35;

        int left = 0;
        int right = nums.length -1;

        while (left < right){
            int sum = nums[left] + nums[right];

        if(sum == target){
            System.out.println("Found: " +  nums[left] + " + " + nums[right] );
            return;

        } else if (sum < target) {
            left++;
        }else {
            right--;
        }

        }


        System.out.println("There is not two numbers that add " + target);
    }


    public static int  stock(){

         int[] prices = {7,1,5,3,6,4};

        int length = prices.length -1;


        return 0;
    }



}
