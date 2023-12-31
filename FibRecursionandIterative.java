package fibrecursionanditerative;

public class FibRecursionandIterative 
{
    static long fibRecursive(long n) //recursice fib
    {
	if (n < 2) {
            return n;
	} else {
		
            return fibRecursive(n - 1) + fibRecursive(n - 2);
	}
    }

    static long fibIterative(long n)//iterative fib
    {
	long a = 0;
	long b = 1;
	long c = 0;
	for (int i = 0; i < n - 1; i++) {
		c = a + b;
		a = b;
		b = c;
	}
        
	return c;
	}

    public static void main(String[] args) {

        int size[] = new int[] {5, 10, 15, 20, 30, 40, 50};//values to test

        long startTime, endTime;//nano time variables
        
        for (int n: size) {

            
            startTime = System.nanoTime();//calling recursion
            long res = fibRecursive(n);
            endTime = System.nanoTime();
            System.out.println("Recursive - Size: " + n + " Time Taken: " + (endTime-startTime) + " Value:" + res);

            startTime = System.nanoTime();//calling 
            res = fibIterative(n);
            endTime = System.nanoTime();
            System.out.println("Iterative - Size: " + n + " Time Taken: " + (endTime-startTime) + " Value:" + res);
        }
    }
}
