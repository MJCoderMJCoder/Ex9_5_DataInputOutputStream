package com.datastream;
/*
 * 将Java基本类型数据写入文件，然后读出这些数据并显示
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {

	public static void main(String[] args) throws IOException {
		char c = 'A';
		int i = 3721;
		long l = 123456;
		float f = 3.14f;
		double d = 3.1415926535;
		String str = "基本数据类型输入输出实例";
		DataOutputStream output = new DataOutputStream(new FileOutputStream("./datastream.dat"));
		output.writeChar(c);
		output.writeInt(i);
		output.writeLong(l);
		output.writeFloat(f);
		output.writeDouble(d);
		output.writeUTF(str);
		output.close();
		DataInputStream input = new DataInputStream(new FileInputStream("./datastream.dat"));
		char cc = input.readChar();
		int ii = input.readInt();
		long ll = input.readLong();
		float ff = input.readFloat();
		double dd = input.readDouble();
		String sstr = input.readUTF();
		input.close();
		System.out.println(cc + "\n" + ii + "\n" + ll + "\n" + ff + "\n" + dd + "\n" + sstr);
		
	}

}
