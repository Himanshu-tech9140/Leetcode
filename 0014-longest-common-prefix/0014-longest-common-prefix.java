class Solution {
    public String longestCommonPrefix(String[] strs) {

       //Brute force
    //    String first = strs[0];
    //    for(int i=0; i<first.length(); i++){
    //      char ch = first.charAt(i);
           

    //     for(int j=1; j<strs.length; j++){
    //         if(i==strs[j].length() || strs[j].charAt(i)!=ch){
    //             return first.substring(0,i);
    //         }
    //     }
    //    }
    //    return first;
// }

   //optimal solution
           String prefix = strs[0];
           for (int i=1; i<strs.length; i++){
             while(!strs[i].startsWith(prefix)){
                prefix =prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()){
                    return "";
           }
             }
           }

           
           return prefix;
} 
}