package com

class TestG {
     static void main(def args){ 
     
		 Testjava.test();
		 
		 Book book = new Book("tt");
		 book.title = "123";
		 //title 是private 为什么能直接访问。
		 println book.title;
		 
		 def i = 1..10;
		i.each {s-> println s}
		def d = 0;
		def c = 0;
		1.upto(100) { m->
			  c = m-1
			  d += c
		}
		println "dd="+d
		test();
		
		this.getMetaClass().invokeMethod(this, "test" );
		
		def code = '1 + ' 
		code += System.getProperty('os.version')
		
		println code
	 
     }
	 public static void test(){
		 int m = 0;
		 for(int i =0 ;i<100;i++){
			  m  += i;
		 }
		 println "mm="+ m
	 }
}
