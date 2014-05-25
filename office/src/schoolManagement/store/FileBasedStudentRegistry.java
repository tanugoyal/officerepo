package schoolManagement.store;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import schoolManagement.model.Student;

public class FileBasedStudentRegistry implements
		Serializable, StudentRegistry {
	private static final long serialVersionUID = 1L;

	final String fileStore;
	Map<Integer, Student> students = new HashMap<Integer, Student>();

	public FileBasedStudentRegistry(final String fileStore) {
		this.fileStore = fileStore;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void load() throws ClassNotFoundException, IOException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				fileStore))) {
			students = (Map<Integer, Student>) in.readObject();
		}
	}

	@Override
	public void save() throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(fileStore))) {
			out.writeObject(students);
		}
	}

	@Override
	public Student putStudent(final Student student) {
		return students.put(student.getRollNumber(), student);
	}

	@Override
	public Student getStudent(final int rollNumber) {
		return students.get(rollNumber);
	}
	
	@Override
	public Student removeStudent(final int rollNumber) {
		return students.remove(rollNumber);
	}

}
