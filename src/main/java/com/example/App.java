package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImmutableList<String> fruits = ImmutableList.of("Apple","Banana","Cherry");
        System.out.println(fruits);
        
        File sourcefile = new File("Source.txt");
        File destinfile = new File("Destin.txt");
        
        try{
        	FileUtils.copyFile(sourcefile,destinfile);
        	System.out.println("Succesfully copied");
        	}
        catch(IOException e){
        		System.out.println("Error : "+ e.getMessage());
        		}
    }
}
