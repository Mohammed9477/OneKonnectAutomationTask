package utilities.datareaders;

import org.testng.annotations.DataProvider;
import utilities.config.LoadProperties;

import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;

public class DataProviderUtils {
    static String LoginDataPath = LoadProperties.LoginDataPath;
    static String FormDataPath = LoadProperties.FormDataPath;

    @DataProvider(name = "LoginData")
    public static Iterator<Object[]> LoginData() throws IOException {
        return readJsonData(validateFilePath(LoginDataPath));
    }
    @DataProvider(name = "FormData")
    public static Iterator<Object[]> formData() throws IOException {
        return readJsonData(validateFilePath(FormDataPath));
    }
    private static String validateFilePath(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty");
        }
        return filePath.toLowerCase(Locale.ROOT);
    }


    private static Iterator<Object[]> readJsonData(String filePath) throws IOException {
        return JSONReaderUtil.readJson(validateFilePath(filePath));
    }
}
