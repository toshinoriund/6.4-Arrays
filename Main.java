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








    }
}
