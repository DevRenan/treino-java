class A{
    public static void main( String[] args ) {
        int x[] = new int[3];
        for(x[1]=x.length-1;x[0]==0;x[1]--){
            x[x[1]]= -5;
            System.out.println(x[1]);
        }
    }
}

//ERRO DE EXECUÇÃO

// 1
//  0 = 0
//  1 = 2
//  2 = -5
//
// 2
//  0 = 0
//  1 =-5
//  2 = -5
//
// 3 0 = 0
//   1 = -6 (Aqui, na linha5 ele vai tentar acessar a posição, -6 que não existe


//2
//        -5
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -6 out of bounds for length 3
//        at A.main(TesteDeclaracaoArray3.java:5)
