public class Sum {
  
    
    public int sum(int a, int b)
    {
        return (a + b);
    }
  
    
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
  
    
    public double sum(double x, double y)
    {
        return (x + y);
    }
  
    
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(15, 80));
        System.out.println(s.sum(19, 90, 30));
        System.out.println(s.sum(11.5, 20.5));
}
}