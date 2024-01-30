class Solution
{
    public void majorityElement()
    {
        int a[] = {3,1,3,3,2};
        int size = a.length;
        int count =0;
        int element = 0;
      for(int i = 0; i < size; i ++ ){
          
          for(int j = i + 1; j < size; j++ ){
              if(a[i] == a[j]){
                  count ++;
                  if(count > size/2){
                      element = a[i];
                  }
              }
          }
      }
      System.out.println(element);
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.majorityElement();
    }
}
