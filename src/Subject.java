public class Subject {
    private String name;
    private float estimateDuration;
    private Teacher teacher = new Teacher();

    public String getName() {
        return this.name;
    }

    public float getEstimateDuration() {
        return this.estimateDuration;
    }

    public void setEstimateDuration(float time) {
        this.estimateDuration = time; 
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher= teacher;
    }



}
