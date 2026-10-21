public class OverflowReferenceInvestigator {

    public static void main(String[] args) {
        byte number = 123;
        number++;
        
        System.out.println("Primitive Overflow");
        System.out.println("Byte after increment: " + number);
        
        String string1 = new String("Java");
        String string2 = new String("Java");
        String string3 = "Java";
        
        System.out.println("\nString Comparison");
        
        System.out.println("str1 == str2 :" +(string1 == string2));
        //mali kasi string1 and string2 ay magkaiba yung objects sa memory
        
        System.out.println("str1.equals(str2): " + string1.equals(string2));
        
        System.out.println("str1 == str3: " +(string1 == string3));
        //mali kasi string1 nagr-refer sa iibang object na naggaling sa string
        
        System.out.println("str1.equals(str3):" + string1.equals(string3));
        
        System.out.println("str2 == str3:" + (string2 == string3));
        //mali kasi  yung string2 nagr-refer sa iibang object na nag-galing sa string
        
        System.out.println("str2.equals(str3):" + string2.equals(string3));
        
        int[] array1 = {10,20,30};
        int[] array2 = array1;
        array2[0] = 100;

        System.out.println("\nShared Array Reference");
        System.out.println("Array1 first element: " + array1[0]);
        System.out.println("Array2 first element: " + array2[0]);
        System.out.println("");
    }
    
}
