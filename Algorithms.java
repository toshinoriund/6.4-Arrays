import java.util.Arrays;

public class Algorithms
{
    public void Printall(int[] ints)
    {
        for(int i =0; i< ints.length -1; i++)
        {
            System.out.println(ints[i]);

        }
    }

    public void swap(int[] ints , int a, int b)
    {
        int temp = a;
        ints[a]=ints[b];
        ints[b] = temp;

    }

    public int max(int[] ints)
    {
        int max = ints[0];
        for (int a = 1; a<ints.length-1; a++)
        {
            if (ints[a]>max)
            {
                max=ints[a];
            }
        }
        return max;
    }

    public int min(int[] ints)
    {
        int min = ints[0];
        for (int a = 1; a<ints.length-1; a++)
        {
            if (ints[a]<min)
            {
                min=ints[a];
            }
        }
        return min ;
    }

    public String Shorteststring(String[] strings)
    {
        String shortest = strings[0];
        for (int a = 1; a<strings.length-1; a++)
        {
            int b = shortest.length();
            String temp = strings[a];
            if(temp.length()<b)
            {
                shortest = temp;

            }
        }
        return shortest;

    }

    public String Longeststring(String[] strings) {
        String longest = strings[0];
        for (int a = 1; a < strings.length - 1; a++) {
            int b = longest.length();
            String temp = strings[a];
            if (temp.length() < b) {
                longest = temp;

            }
        }
        return longest;
    }

    public int Largestabs(int[]ints, int[]ints2)
    {
        int diff = 0;
        int temp = 0;
        for(int i=0; i<ints.length;i++)
        {
            temp = Math.abs(ints[i]-ints2[i]);
            if (temp>diff)
            {
                diff = temp;
            }

        }
        return diff;
    }

    public double Mean(double[]doubles)
    {
        double temp = 0.0;
        for (int i = 0; i < doubles.length - 1; i++ )
        {
            temp += doubles[i];
        }
        return temp/ doubles.length;
    }
    
    public void Reverse(int[]ints)
    {
        int temp;
        for(int i =0;i<ints.length/2;i++)
        {
            temp =ints[i];
            ints[i]=ints[ints.length-1-i];
            ints[ints.length-1-i]=temp;
        }

    }

    public boolean Consecutive(int[]ints)
    {
        for(int i =0;i<ints.length-2;i++)
        {
            if(ints[i]==ints[i+1])
            {
                return true;
            }

        }
        return false;
    }

    public int Negative(int[]ints)
    {
        for(int i =0;i<ints.length-1;i++)
        {
            if (ints[i]<0)
            {
                return i;
            }

        }
        return -1;

    }

    public boolean Equivalent(int[]ints)
    {
        for(int i =0;i<ints.length-1;i++)
        {
            for(int k =0;i<ints.length-1;k++)
            {
                if (ints[i]==ints[k])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int Streak(int[]ints,int a)
    {
        int count =0;
        for(int i =0;i<ints.length-1;i++)
        {
            if (ints[i]==a)
            {
                count++;
            }
        }
        return count;
    }

    public String Alphabetically(String[]strings)
    {
        Arrays.sort(strings);
        return strings[strings.length-1];
    }






}
