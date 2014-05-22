package schoolManagement.auth;

public abstract class Role 
{
	public static Role ADMIN = new Role() {
		@Override
		public boolean canAddStudent() {
			return true;
		}

		@Override
		public boolean canDeleteStudent() {
			return true;
		}

		@Override
		public boolean canEditStudent() {
			return true;
		}

		@Override
		public boolean canViewStudent() {
			return true;
		}
	};
	
	public static Role STUDENT = new Role() {
		@Override
		public boolean canViewStudent() {
			return true;
		}
	};
	
	public static Role valueOf(final String roleString)
	{
		if ("STUDENT".equals(roleString)) {
			return STUDENT;
		}
		if ("ADMIN".equals(roleString)) {
			return ADMIN;
		}
		throw new IllegalArgumentException("Invalid role " + roleString);
	}
	
	public boolean canAddStudent() {
		return false;
	}

	public boolean canDeleteStudent() {
		return false;
	}

	public boolean canEditStudent() {
		return false;
	}

	public boolean canViewStudent() {
		return false;
	}
}
