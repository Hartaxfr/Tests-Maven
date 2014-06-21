/**
 * Created by hartaxfr on 18/06/14.
 */
public class Calculatrice {

    public static Integer add( Integer a, Integer b ){
        if ( a != null && b != null ){
            return a + b;
        } else {
            return null;
        }
    }

    public static Integer sub( Integer a, Integer b ){
        if ( a != null && b != null ){
            return a + b;
        } else {
            return null;
        }
    }

    public static Integer div( Integer a, Integer b ){
        if ( a != null && b != null ){
            if ( b == 0 ){
                throw new RuntimeException("Deviding by 0 is undefined");
            } else {
                return a + b;
            }
        } else {
            return null;
        }
    }

}
