import java.util.Arrays;

public class Algorithms
{
    public void Printall(int[] ints)
    {
        for(int i =0; i< ints.length; i++)
        {
            System.out.print(ints[i] + " ");

        }
        System.out.println();
    }

    public void swap(int[] ints , int a, int b)
    {
        int temp = ints[a];
        ints[a]=ints[b];
        ints[b] = temp;

    }

    public int max(int[] ints)
    {
        int max = ints[0];
        for (int a = 1; a<ints.length; a++)
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
        for (int a = 1; a<ints.length; a++)
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
        for (int a = 1; a<strings.length; a++)
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
        for (int a = 1; a < strings.length; a++) {
            int b = longest.length();
            String temp = strings[a];
            if (temp.length() > b) {
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
        for (int i = 0; i < doubles.length; i++ )
        {
            temp += doubles[i];
        }
        return temp/ doubles.length;
    }
    
    public void Reverse(int[]ints)
    {
        int temp;
        for(int i =0;i<  ints.length/2;i++)
        {
            temp =ints[i];
            ints[i]=ints[ints.length-1-i];
            ints[ints.length-1-i]=temp;
        }

    }

    public boolean Consecutive(int[]ints)
    {

        for(int i =0;i<ints.length-1;i++)
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
        for(int i =0;i<ints.length;i++)
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
        for(int i =0;i<ints.length;i++)
        {
            for(int k =i+1;k<ints.length;k++)
            {
                if (ints[k]==ints[i])
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
        int returning=0;
        for(int i =0;i<ints.length;i++)
        {
            if (ints[i]==a)
            {
                count++;
            }
            else
            {
             count=0;
            }
            if (count>returning)
            {
                returning=count;
            }

        }
        return returning;
    }

    public String Alphabetically(String[]strings)
    {
        Arrays.sort(strings);
        return strings[strings.length-1];
    }






}
