package state;

public interface State {
	public void logIn(String account);
	public void logOut();
	public void rentalBook();
	public void returnBook();
	public void registerBook();
	public void print();
}
