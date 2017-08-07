package nxt;

import java.math.BigInteger;

public final class Genesis {

    public static final Long GENESIS_BLOCK_ID = 145656983968890052L;
    public static final Long CREATOR_ID =  3342252292595121715L; 
    public static final byte[] CREATOR_PUBLIC_KEY = {
          82, -111, -63, -33, 30, -76, -11, -60, -41, 76, 31, 126, -112, 95, 43, -82, 87, 87, -63, 74, -126, 126, 9, -119, 69, -49, -51, -112, -88, -58, -7, 84
    };

    public static final Long[] GENESIS_RECIPIENTS = {
            (new BigInteger("16985221722424377042")).longValue()};

    public static final int[] GENESIS_AMOUNTS = {
            2000000000
    };

    public static final byte[][] GENESIS_SIGNATURES = {
            {-71, -42, -12, 21, -3, 98, 102, -116, -122, 115, 65, 46, -84, -58, -84, -2, -64, 13, 61, 64, -19, 83, 65, -48, -89, -25, -117, -78, 10, 93, -16, 9, -56, 75, -121, 45, -10, 27, -62, -101, -44, -2, 60, -56, -127, 47, 18, 38, 86, -47, 2, -113, -1, 112, 87, 25, 105, -124, -127, -112, -17, -82, -45, 83}
    };

    public static final byte[] GENESIS_BLOCK_SIGNATURE = new byte[]{
			-119, -32, 112, -111, 16, 102, 78, -11, 94, -102, 86, -116, -53, -89, -78, 47, -91, -85, -72, -32, 51, 4, 122, -76, 85, -12, -34, -21, 31, -74, -32, 6, -85, 64, -58, 71, 37, 20, 91, 33, 101, 95, 45, -122, 62, 80, -17, -86, -15, 73, 56, 29,124, -40, 98, -67, 5, -80, 26, -26, 13, -7, -21, 73
    };

    private Genesis() {} // never

}
