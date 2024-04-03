import java.io.*;

public class FileExample {

    public static void main(String[] args) throws IOException {

        FileWriter1();
        FileReader1();
    }

    static void FileWriter1() throws IOException {

        String data = "Hoanganh dang test doc ghi file "+  "blablabla";
        try {
            //Tạo một FileWriter
            FileWriter output = new FileWriter("D:\\Code learning\\hoanganhtest.txt");
            //Ghi string vào file
            output.write(data);
            System.out.println("Write success");
            //Đóng writer
            output.close();
        }
        catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }

    static void FileReader1() throws IOException{

        int ch;
        // check xem file có tồn tại không
        FileReader fr = null;
        try
        {
            fr = new FileReader("D:\\Code learning\\hoanganhtest.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        // đọc file
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);

        // đóng trình đọc
        fr.close();
    }
}
