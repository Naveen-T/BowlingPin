public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int i=0, sum=0, one=0, two=0, spare = 0, strike = 0;
char a[] = new char[];
char b[] = new char[];

for(i=0; i<10; i++){
    Syste.out.println("Enter two rolls for single frame");
     a[one] = sc.next().charAt(one);
     b[two] = sc.next().charAt(two);
      
            if(a[one] == 'X'){
              sum = sum + 10;
              bonus = 1;
              if(i == 0){
                      one++;
                      two++;
                      break;
              }
            }
            else if(b[two] == '/'){
              sum = sum + 10;
              bonus = 2;
            }
            else
               sum = Integer.parseInt(String.valueOf(a[one]) + Integer.parseInt(String.valueOf(b[two]);
          
       if(bonus == 1){
          strike = Integer.parseInt(String.valueOf(a[one]) + Integer.parseInt(String.valueOf(b[two]);
          sum = sum + strike;
         bonus = 0;
        }
        else if(bonus == 2){
          spare = Integer.parseInt(String.valueOf(a[one]);
          sum = sum + spare;
          bonus = 0;
        }
        one++;
        two++;
    }
    System.output.println("Total Score in the game" + sum);                              
}
