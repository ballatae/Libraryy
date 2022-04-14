package deafult;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String name;
	static final int MAX_ON_LOAN = 6;
	private List<Borrowable> onLoan;

	// final means the attribute is a constant
	// static: we will discuss this on week 6-7
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		onLoan = new ArrayList<Borrowable>(MAX_ON_LOAN);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// id and name
		// either "has nothing on loan
		// or the list of items currently borrowed by the member
		String msg = id + " - " + name + " and currently has " + onLoan.size() + " borrowable items:" + "\n";

		if (onLoan.size() == 0) {
			msg += "The member currently has nothing on loan";
		} else {
			for (Borrowable b : onLoan) {
				msg += b.toString() + "\n";
			}
		}
		return msg;

	}

	public void borrows(Borrowable b) {
		// if b is not available
		// "error" -> throw exception

		// if member exceeds maximum
		// "error" -> throw exception

		// if b is already borrowed by the
		// member "error" -> throw exception

		// best case scenario
		onLoan.add(b);
		// change the availability of b

	}

	public void returns(Borrowable b) {
		// if(!onLoan.contain(b))
		// // throw exception

		// b becomes available
		onLoan.remove(b);
	}
}
