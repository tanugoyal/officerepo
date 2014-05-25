package schoolManagement.store;

import java.io.IOException;

import schoolManagement.model.Student;

public interface StudentRegistry {

	public void load() throws ClassNotFoundException, IOException;

	public void save() throws IOException;

	public Student putStudent(Student student);

	public Student getStudent(int rollNumber);

	public Student removeStudent(int rollNumber);

}