import java.io.*;

public class FileExample {

    public static void main(String[] args) throws IOException {

//        FileWriter1();
//        FileReader1();
//          FileEdit();
//        FileRemove();
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
        try {
            fr = new FileReader("D:\\Code learning\\hoanganhtest.txt");
        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        // đọc file
        while ((ch=fr.read())!=-1) {
            System.out.print((char) ch);
        }

        // đóng trình đọc
        fr.close();
    }

    static void FileEdit() throws IOException{

        String newData = "da edit file";
        // check xem file có tồn tại không
        File file = new File("D:\\Code learning\\hoanganhtest.txt");
        if(file.exists()){
            file.delete();
            FileWriter output = new FileWriter("D:\\Code learning\\hoanganhtest.txt");
            //Ghi string vào file
            output.write(newData);
            System.out.println("Write success");

            output.close();
        }
        else{
            System.out.println("file not found");
        }
    }

    static void FileRemove() throws IOException{

        File file = new File("D:\\Code learning\\hoanganhtest.txt");
        if(file.exists()){
            file.delete();
            System.out.println("file deleted");
        }
        else{
            System.out.println("file not found");
        }
    }
}
