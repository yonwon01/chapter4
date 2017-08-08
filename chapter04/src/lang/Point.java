package lang;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public int hashCode() {//내용기반에 해쉬코드로 오버라이딩해서 성능향상시킴->객체가 다르더라도 같은 값의 해쉬코드가 나옴
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
