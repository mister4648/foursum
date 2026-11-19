import java.util.*;
public class foursum {
    public List<List<Integer>> fs(int[] nums,int target){
         List<List<Integer>>ans = new ArrayList<>();
         int n=nums.length;
         Arrays.sort(nums);
            for(int i=0;i<n;i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                for(int j=i+1;j<n;j++){
                    if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = n-1;
                while(left<right){
                    long sum= (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        ans.add(temp);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;

                        }
                        while(left<right && nums[right]==nums[right+1]){
                            right--;
                        }

                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }

                }
            }
            }
            return ans;
        }

        public static void main(String[] args){
            foursum obj = new foursum();
            int[] nums={1,1,1,2,2,2,3,3,3,4,4,4,5,5};
            System.out.println(obj.fs(nums, 8));
        }
}

