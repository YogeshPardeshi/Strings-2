class Problem1 {
    public int strStr(String haystack, String needle) {
        
        int m = haystack.length();
        int n = needle.length();
        int i = 0;
        if (n>m) return -1;
        
        while(i<=m-n) {
            int k = 0;
            if(haystack.charAt(i) == needle.charAt(k)) {
                int j = i;
                

                while(haystack.charAt(j) == needle.charAt(k)) {
                    j++;
                    k++;
                    if(k == n) return i;
                }

            }
            i++;
        }

    return -1;
    }
}
