package ufscar.es2.objects;

public class Point {

	private double x, y;

	public double distance(Point p) {
		double dist = 0;
		dist = Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
		return dist;
	}

	public double abc() throws Exception {
		throw new NullPointerException("excecao qualquer");
	}

	public void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
