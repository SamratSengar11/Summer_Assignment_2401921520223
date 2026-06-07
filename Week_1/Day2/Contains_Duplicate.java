class Solution {
  // Using Hashset
    public boolean containsDuplicate(int[] nums) {


Set<Integer> Unique= new HashSet<>();
for(int each:nums){
    if(Unique.contains(each)) return true;
    Unique.add(each);

}
return false;}
}
//Bruteforce approach
//class Solution {
   // public boolean containsDuplicate(int[] nums) {
//         int n =nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]==nums[j]) return true;
                
//         }
        
//     }
//   return false; 
