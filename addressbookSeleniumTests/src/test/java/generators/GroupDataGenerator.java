package generators;

import com.telran.selenium.model.GroupData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class GroupDataGenerator {

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(args[0]);
        File file = new File(args[1]);

        List<GroupData> groups = generateGroups(count);
        save(groups, file);

    }

    private static void save(List<GroupData> groups, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for(GroupData group: groups){
            writer.write(String.format("%s;%s;%s\n",
                    group.getGroupName(), group.getGroupHeader(), group.getGroupFooter()));
        }
        writer.close();
    }


    private static List<GroupData> generateGroups(int count) {
        List<GroupData> groups = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            groups.add(new GroupData()
                    .withGroupName(String.format("groupName %s", i))
            .withGroupHeader(String.format("groupHeader %s", i))
            .withGroupFooter(String.format("groupFooter %s", i)));


        }

        return groups;
    }

}
