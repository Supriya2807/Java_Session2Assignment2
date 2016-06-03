package acadgild.assignments;

public class session2assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate Prime noes from 1to 100.
		
		                int i=2,j=2;
		                


		                System.out.println("Prime numbers between 1 and 100");

            
	                
		                for( i=2; i<100; i++){

                                int modulus=0;              
		                        for(j=2; j<i; j++){

                                         if(i % j == 0){
                                        modulus++;
                                                                              
		                                 break;

		                                }

		                  }

		                   if(modulus==0)     
                           System.out.print(i + " ");

		                }


		        }


		}


