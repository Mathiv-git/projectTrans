package pomfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class logFiles {
	


	public void info(String location,String content)
	{
		String flag="INFO";
		writeLog(location, flag, content);
	}
	public void warn(String location, String content)
	{
		String flag="WARN";
		writeLog(location, flag, content);
	}
	public void writeLog(String location, String flag, String content) {
		try {
			File file = new File(location+"\\Automation_Log.txt");
			FileOutputStream outputStream = new FileOutputStream(file, true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(System.currentTimeMillis());
			bufferedWriter.write(formatter.format(date)+"\t"+flag+"\t"+"- "+content);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void createLog(String location) {
		try {
			File file = new File(location+"\\Automation_Log.txt");
			if (!file.exists())
			{
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
