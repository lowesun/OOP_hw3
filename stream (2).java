import java.util.List;


public interface stream {
    List<IGroup> getGroups();


    void addGroup(group group);

    int getCountGroups();

    IGroup getGroup(int index);

    void setName(String name);
    String getName();
}