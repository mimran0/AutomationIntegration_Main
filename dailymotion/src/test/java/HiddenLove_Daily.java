import org.junit.Assert;

public class HiddenLove_Daily {
    public static void main(String[] args) {
        //below are some sample code
        String isExist;
        System.out.println("I love you more when you look at my that");
        String st="I love you more when you look at my that";
        boolean ifExist=st.contains("love");
        //below is a "if condition" which is written for fun
        if(ifExist==true){
            System.out.println("Yes, love is there");
             isExist="Yes";
        }else {
            System.out.println("There is no love");
            isExist="No";
        }
        //below line indicates that Junit jar file is configured as dependency
        Assert.assertEquals("Yes",isExist);

    }
}
