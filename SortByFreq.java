public class SortByFreq
{
	public static void main(String args[])
    {
        int arr[] = {5,5,4,6,4};
        int length = arr.length;
        int freq[][] = new int[length][2];
        int res[] = new int[length];
        int i,j,count;
        int temp;
        
        for(i=0;i<length;i++)
        {
            if(arr[i]==-999)
                continue;
            
            count = 1;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                    arr[j]=-999;
                }
            }
            
            freq[i][0] = arr[i];
            freq[i][1] = count;
        }
        
        for(i=0;i<length;i++)
        {
            for(j=0;j<length-1;j++)
            {
                if(freq[j+1][1] > freq[j][1])
                {
                  temp = freq[j+1][1];
                  freq[j+1][1] = freq[j][1];
                  freq[j][1] = temp;
                  
                  temp = freq[j+1][0];
                  freq[j+1][0] = freq[j][0];
                  freq[j][0] = temp;
                }
                else if(freq[j+1][1] == freq[j][1])
                {
                    if(freq[j+1][0] < freq[j][0])
                    {
                      temp = freq[j+1][1];
                      freq[j+1][1] = freq[j][1];
                      freq[j][1] = temp;
                      
                      temp = freq[j+1][0];
                      freq[j+1][0] = freq[j][0];
                      freq[j][0] = temp;
                    }
                }
            }
        }
        
        int val,fr;
        int index=0;
        for(i=0;i<length;i++)
        {
            val = freq[i][0];
            for(fr = freq[i][1];fr>0;fr--)
            {
              res[index] = val;
              index++;
            }
        }
        
        for(i=0;i<length;i++)
        {
           System.out.print(res[i] + " ");
        }
    }
}