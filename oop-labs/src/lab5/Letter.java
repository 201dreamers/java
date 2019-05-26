package lab5;

public class Letter {

	private StringBuilder letter;
	public Letter(StringBuilder letter){
		this.letter = letter;
	}

	public StringBuilder getLetter(){
		return letter;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Letter) {
			return ((Letter) obj).letter == letter;
		}
		return false;
	}
}
