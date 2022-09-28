public class Mix {
    int counter = 0;

    public static void main(String[] args) {

        //declare array of 20 objects
        Mix [] m2 = new Mix[20];
        //declare variables count and x
        int count = 0;
        int x = 0;

        //while x less than 9
        while ( x < 9 ) {
            //assign new object to the array element x
            m2[x] = new Mix();
            //increment counter by 1
            m2[x].counter += 1;
            //increment count by 1plus return value of maybeNew method
            count += 1;
            count += m2[x].maybeNew(x);

            x += 1;
        }
        //print the result
        System.out.println("Count = " + count + ", counter =  " + m2[1].counter);
    }
    
    public int maybeNew(int index) {
        if ( index < 5) {
            Mix m = new Mix();
            m.counter += 1;
            return 1;
        }
        return 0;
    }
}
