package counter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BlockCounter {

	public static void main(String[] args) throws IOException {
		//@para[0]  the file name;
		//@para[1]  the block size in KB;
		File file_in = new File(args[0]);
		int block_size = Integer.parseInt(args[1])*1024;
		System.out.println("The  input file name is: "+file_in);
		System.out.println("The  block size is: "+block_size/1024 + "KB");
		InputStream reader = new FileInputStream(file_in);
		
		int block_num = 0;
		byte[] bb = new byte[block_size];
		int length = reader.read(bb);
		while(length != -1)
		{
			block_num++;
		}
		System.out.println("The  total block number  is: "+block_num);
		reader.close();
		return;
	}

}
