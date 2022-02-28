import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList;

    // part c
    public ArrayList <LogMessage> removeMessages (String Keyword) {
        ArrayList <LogMessage> newList = new ArrayList <LogMessage> ();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(Keyword)) {
                LogMessage  w = messageList.get(i);
                newList.add(w);
                messageList.remove(i);
                i--;

            }


        }
        return newList;

    }
}
