package bo;

import java.io.IOException;
import java.util.List;


import exception.AlphaNumericOnly;
import exception.FileNameNotFoundException;
import model.FileDetail;

public interface FileManagerBO {
	public FileDetail createFile(String name) throws IOException, AlphaNumericOnly;
	public boolean deleteFile(String name) throws FileNameNotFoundException;
	public List<FileDetail> getAllFiles();
	public boolean searchFile(String name);
}
