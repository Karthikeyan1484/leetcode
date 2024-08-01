class Solution {
    public int countSeniors(String[] details) {
        int sum=0;
        for(int i=0;i<details.length;i++){
            String s=details[i];
            String str=s.substring(11,13);
            int age=Integer.parseInt(str);
            if(age>60){
                sum++;
            }
        }return sum;
    }
}