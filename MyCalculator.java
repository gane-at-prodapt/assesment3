package assesment3;

interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		int i=1;
		int sum=0;
		while(i*i<=n) {
			if(n%i==0) {
				sum+=i;
				if(n/i!=i) {
					sum+=(n/i);
				}
			}
			i++;
		}
		return sum;
	}
	public static void main(String args[]) {
		MyCalculator m = new MyCalculator();
		System.out.println(m.divisor_sum(6));
	}

}
