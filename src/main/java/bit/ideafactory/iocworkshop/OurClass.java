package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;

import java.util.*;

public class OurClass {
    private final Collection<Student> students;

    public OurClass(List<Student> students) {
        this.students = Collections.unmodifiableCollection(students);
    }

    public Map<Student, Paper> writeEssay(List<String> paragraphs) {
        final Map<Student, Paper> papers = new HashMap<>();
        students.forEach(s -> {
            s.writeEssay(paragraphs);
            papers.put(s, s.getPaper());
        });
        return papers;
    } 
}
