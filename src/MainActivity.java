/**
 * Created by wh on 16/8/26.
 */

public class MainActivity {

    public static void main(String[] args){
        AES mAes = new AES();

        String mString = "神奇的AES";


        byte[] mBytes = null;


        try {
            mBytes = mString.getBytes("UTF8");



        } catch (Exception e) {
            // TODO: handle exception
        }

        String enString = mAes.encrypt(mBytes);

        System.out.print(enString);



        String deString = mAes.decrypt(enString);
//    Log.i("aes123", deString);
    }


}



