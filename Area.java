package firstJavaProject;

class AreaCalculator {
	float pi;
	float r;

	public AreaCalculator() {
		pi = 3.14f;

	}

	public void setR(float r) {
		this.r = r;

	}

	public float getR() {
		return r;

	}

	public float calculateResult() {

		float result = pi * r * r;

		return result;

	}
}

public class Area {
	public static void main(String[] args) {
		AreaCalculator ac = new AreaCalculator();
		ac.setR(3f);
		float result = ac.calculateResult();
		System.out.println("result of r of " +  ac.getR() + " is " + result);
	}

}
