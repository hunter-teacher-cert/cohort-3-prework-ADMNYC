class Array {
  public static void powArray(){
    double[] a = new double[]{1, 2, 3, 4, 5};
    
    System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
    System.out.print("{" + Math.pow(a[0],2));
        for (int i = 1; i < a.length; i++) {
        System.out.print(", " + Math.pow(a[i],2));
    }
    System.out.println("}");}
   
  public static void main(String args[]){
  powArray();
}
    }