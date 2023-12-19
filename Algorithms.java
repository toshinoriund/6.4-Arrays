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





}
