package ca.healthcare.Nov09.ver;

import java.util.Comparator;

public class UserSoter {
	public static class CompareByName implements Comparator<User> {
		
		@Override
		public int compare(User u1, User u2) {
			return u1.getLName().compareTo(u2.getLName());
		}
		
	}
}
