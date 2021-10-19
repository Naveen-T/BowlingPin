public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int i=0, sum=0, one=0, two=0, spare = 0, strike = 0;
char a[10], b[10];

for(i=0; i<10; i++){
    Syste.out.println("Enter two rolls for single frame");
    char[] a = sc.next().toCharArray();
    char[] b = sc.next().toCharArray();
      
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
               sum = a[one] + b[two];
          
       if(bonus == 1){
          strike = a[one] + b[two];
          sum = sum + strike;
         bonus = 0;
        }
        else if(bonus == 2){
          spare = a[one];
          sum = sum + spare;
          bonus = 0;
        }
        one++;
        two++;
  }
}
