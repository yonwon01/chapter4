package util;

public class Value {
	private int value;

	public Value(int value) {
		this.value = value;

	}

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}

	// 기본object에 해쉬코드 값음 참조값이여서 같은 숫자여도 다른 값이 나오기때문에 오버라이딩 해주어야함
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	
	//해쉬코드값 까지도 판별이 안되면 equals까지 확인.?
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (value != other.value)
			return false;
		return true;
	}

}
