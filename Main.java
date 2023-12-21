public class Main
{
    public static void main(String[] args)
    {
        Algorithms algorithm = new Algorithms();

        int[] ex1= {1,2,3};
        int[] ex2= {4,5,6};
        int[] ex3= {7,8,9};
        algorithm.Printall(ex1);
        algorithm.Printall(ex2);
        algorithm.Printall(ex3);

        int[] swapex1 = {1,2,3,4};
        int[] swapex2 = {24,25,14,53};
        int[] swapex3 = {35, 12, 34,25};
        algorithm.swap(swapex1,1,2);
        algorithm.swap(swapex2,0,3);
        algorithm.swap(swapex3,2,3);
        algorithm.Printall(swapex1);
        algorithm.Printall(swapex2);
        algorithm.Printall(swapex3);

        int[] maxex1 = {3,2,1};
        int[] maxex2 = {5,1,9};
        int[] maxex3 = {12,37,53};
        System.out.println(algorithm.max(maxex1));
        System.out.println(algorithm.max(maxex2));
        System.out.println(algorithm.max(maxex3));

        int[] minex1 = {3,2,1};
        int[] minex2 = {13,15,11};
        int[] minex3 = {23,3,-4};
        System.out.println(algorithm.min(minex1));
        System.out.println(algorithm.min(minex2));
        System.out.println(algorithm.min(minex3));

        String[] shortex1= {"Hello,","world", "!"};
        String[] shortex2= {"who","what","where"};
        String[] shortex3= {"elephant", "kangaroo","mouse"};
        System.out.println(algorithm.Shorteststring(shortex1));
        System.out.println(algorithm.Shorteststring(shortex2));
        System.out.println(algorithm.Shorteststring(shortex3));

        String[] longex1= {"Hello,","world", "!"};
        String[] longex2= {"why","whom","wherever","whynot"};
        String[] longex3= {"to","and","moose"};
        System.out.println(algorithm.Longeststring(longex1));
        System.out.println(algorithm.Longeststring(longex2));
        System.out.println(algorithm.Longeststring(longex3));

        int[] absoluteex1={2,3,4};
        int[] absdiffex1={-1,-2,-3};
        System.out.println(algorithm.Largestabs(absoluteex1,absdiffex1));

        int[] absoluteex2={4,6,2};
        int[] absdiffex2={12,43,-43};
        System.out.println(algorithm.Largestabs(absoluteex2,absdiffex2));

        int[] absoluteex3={12307,-10201,40320};
        int[] absdiffex3={-15421,-32432,-3};
        System.out.println(algorithm.Largestabs(absoluteex3,absdiffex3));

        double[] meanex1={2.0,3.0,4.0,5.0};
        double[] meanex2={5.4,1.2,3.6,4.8};
        double[] meanex3={0.0,0.3,0.1,0.5};

        System.out.println(algorithm.Mean(meanex1));
        System.out.println(algorithm.Mean(meanex2));
        System.out.println(algorithm.Mean(meanex3));

        int[] revereseex1= {1,2,3};
        int[] revereseex2= {15,14,234,123};
        int[] revereseex3= {10,11,15,14};

        algorithm.Reverse(revereseex1);
        algorithm.Reverse(revereseex2);
        algorithm.Reverse(revereseex3);


        algorithm.Printall(revereseex1);
        algorithm.Printall(revereseex2);
        algorithm.Printall(revereseex3);

        int[] consecex1={1,2,3,3,4};
        int[] consecex2={1,2,3,17,19};
        int[] consecex3={12,3,7,4,12,12};

        System.out.println(algorithm.Consecutive(consecex1));
        System.out.println(algorithm.Consecutive(consecex2));
        System.out.println(algorithm.Consecutive(consecex3));

        int[] negativeindex1= {1,0,-1};
        int[] negativeindex2= {-3,17,-2};
        int[] negativeindex3= {1,10,13,19};

        System.out.println(algorithm.Negative(negativeindex1));
        System.out.println(algorithm.Negative(negativeindex2));
        System.out.println(algorithm.Negative(negativeindex3));

        int[] equivlaentex1= {1,2,3,2};
        int[] equivlaentex2= {5,2,3,3};
        int[] equivlaentex3= {5,6,7,8,9};

        System.out.println(algorithm.Equivalent(equivlaentex1));
        System.out.println(algorithm.Equivalent(equivlaentex2));
        System.out.println(algorithm.Equivalent(equivlaentex3));

        int[] streakex1 = {1,2,1,1,1};
        int[] streakex2 = {2,2,2,3,3,3};
        int[] streakex3 = {3,4,5,6,6,6,5,6,6};

        System.out.println(algorithm.Streak(streakex1,1));
        System.out.println(algorithm.Streak(streakex2,2));
        System.out.println(algorithm.Streak(streakex3,6));


        String[] alphaex1={"zebra","alpha"};
        String[] alphaex2={"dog","mouse","cat"};
        String[] alphaex3={"house","mansion","street","school"};

        System.out.println(algorithm.Alphabetically(alphaex1));
        System.out.println(algorithm.Alphabetically(alphaex2));
        System.out.println(algorithm.Alphabetically(alphaex3));




















    }
}
