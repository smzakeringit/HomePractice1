package basic;

public class LearnArray3 {

        public static void main(String[] args) {
            // dataType [] arrayName=new dataType
            String [] students = new String [5]; // spot
            students [0] = "Jony"; // Array always start counting from [0]
            students [1] = "Ehsan";
            students [2] = "Shuvo";
            students [3] = "Shah";
            students [4] = "Mizan";
            System.out.println(students[3] );
            // other syntax
            // another way to array syntax
            // String
            String [] students1={"Jony", "Ehsan", "Shuvo", "Shah", "Mizan"};
            System.out.println(students1[4]);
            // create an array of multiples of tree: first five
            int [] multiple=new int[5]; // array of 5 length or, 5 spots
            multiple[0]=3;
            multiple[1]=6;
            multiple[2]=9;
            multiple[3]=12;
            multiple[4]=15;
//            System.out.println(multiple[2]);
//            System.out.println(multiple[2]);
//            System.out.println(multiple[2]);
//            System.out.println(multiple[2]);

            int [] multiple1= {3,6,9,12,15};
            System.out.println(multiple[4]);

            for(int i=0; i<multiple.length; i++){ // multiple.length =5
                System.out.println(multiple [i]);
            }
        }
    }
