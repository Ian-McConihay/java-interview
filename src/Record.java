import java.util.Map;
//Read more about records
//Essentially record is a feature of java 14 that allows you to create a POJO class writing minimal code
// it automatically generates hashCode(), equals(), getters, and toString().
//

public record EmpRecord(int id, String name, long salary, Map<String, String> addresses) {
}



