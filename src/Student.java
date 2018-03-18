

	public class Student implements java.io.Serializable {

		private long id;
		private String name;
		private String surname;
		private String pesel;
		private int classid;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getPesel() {
			return pesel;
		}

		public void setPesel(String pesel) {
			this.pesel = pesel;
		}
		
		public int getClassid() {
			return classid;
		}

		public void setClassid(int classid) {
			this.classid = classid;
		}

		public String toString() {
			return "Student: " + getName() +" "+ getSurname() +" "+ getPesel();
		}
}
