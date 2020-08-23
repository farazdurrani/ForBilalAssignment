package classmate;

import java.util.ArrayList;
import java.util.List;

public class ClassmatesList {
    private List<Classmate> classMates = new ArrayList<>();

    public void add(Classmate classMate) {
	classMates.add(classMate);
    }

    public Classmate get(int i) {
	return classMates.get(i);
    }

    public List<Classmate> getAll() {
	return classMates;
    }
}
