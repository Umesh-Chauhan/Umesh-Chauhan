import java.io.*;
import java.util.zip.*;

public class Zipper
{
  private static final int  BUFFER_SIZE = 4096;

  private static void extractFile(ZipInputStream in, String outdir, String name) throws IOException
  {
     byte[] buffer = new byte[BUFFER_SIZE];
     BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(outdir,name)));
     int count = -1;
     while ((count = in.read(buffer)) != -1)
       out.write(buffer, 0, count);
     out.close();
	
	/* File path = new File(destination,currFile);  
	System.out.println(path.getPath());
	FileOutputStream fos = new FileOutputStream(path);					
	byte b[] = new byte[4096];
	while(zis.read(b)>0)
	{
		fos.write(b);
	} */
  }

  private static void mkdirs(File outdir,String path)
  {
    File d = new File(outdir, path);
    if( !d.exists() )
      d.mkdirs();
  }

  private static String dirpart(String name)
  {
    int s = name.lastIndexOf( File.separatorChar );
    return s == -1 ? null : name.substring( 0, s );
  }

 

  //public static void extract(File zipfile, File outdir)
  public static void extract(String zipfile, String outdir)
  {
    try
    {
      ZipInputStream zin = new ZipInputStream(new FileInputStream(zipfile));
      ZipEntry entry;
      String name, dir;
      while ((entry = zin.getNextEntry()) != null)
      {
        name = entry.getName();
        if( entry.isDirectory() )
        {
		  new File(outdir,name).mkdirs();
          //mkdirs(outdir,name);
          continue;
        }
        dir = dirpart(name);
        if( dir != null )
		   new File(outdir,name).mkdirs();
          //mkdirs(outdir,dir);

        extractFile(zin, outdir, name);
      }
      zin.close();
    } 
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  
    public static void main(String [] args)
	{
		try
		{
			String inputFilePath = "E:/123.rar";
			String outputFilePath = "E:/";
			extract( inputFilePath, outputFilePath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
  
}
