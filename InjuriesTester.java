public class InjuriesTester {

    public static void main(String[] args)
    {
        Injury boneFracture = new Injury("Bone Fracture", 7, "wrist", "sharp");
        Concussion c1 = new Concussion(6, "head", true);
        Bruise b1 = new Bruise(2, "knee", "purple");

        System.out.println(boneFracture.getName());
        System.out.println(c1.getName());
        System.out.println(b1.getName());
        System.out.println();

        System.out.println(boneFracture);
        System.out.println(c1);
        System.out.println(b1);


    }



}
