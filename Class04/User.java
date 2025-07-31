package Class04;

public class User {

    private int id;
    private String profile;
    private String name;

    public User(int id, String profile, String name) {
        this.id = id;
        this.name = name;
        this.profile = profile;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
