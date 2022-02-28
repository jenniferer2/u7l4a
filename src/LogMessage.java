public class LogMessage {
    private String machineId;
    private String description;


    // part a
    public LogMessage(String message) {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);

    }

    // part b
    public boolean containsWord(String keyword) {
        if (description.indexOf(" " + keyword + " ") != -1 || description.indexOf(" " + keyword) != -1 || description.indexOf(keyword + " ") != -1) {
            return true;
        }
        return false;


    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
}