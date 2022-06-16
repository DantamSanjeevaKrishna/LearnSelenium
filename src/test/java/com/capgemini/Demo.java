package com.capgemini;

public class Demo <DT>{

		String fname;
		DT typeObject;
		public Demo(DT typeObject) {
			this.typeObject=typeObject;
		}
		DT getDTObject() {
			return typeObject;
		}
		
		
}
