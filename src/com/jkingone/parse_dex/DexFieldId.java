package com.jkingone.parse_dex;

public class DexFieldId {

	/*struct DexFieldId {
		ushort classIdx; // index into typeIds list for defining class
		ushort typeIdx; // index into typeIds for field type
		uint nameIdx; // index into stringIds for field name
	}*/

	public static final int BYTE_LEN = 2 + 2 + 4;

	public short classIdx;
	public short typeIdx;
	public int nameIdx;

	public String fieldDefiningClass;
	public String fieldType;
	public String fieldName;

	@Override
	public String toString() {
		return "DexFieldId{" +
				"classIdx=" + classIdx +
				", typeIdx=" + typeIdx +
				", nameIdx=" + nameIdx +
				", fieldClass='" + fieldDefiningClass + '\'' +
				", fieldType='" + fieldType + '\'' +
				", fieldName='" + fieldName + '\'' +
				'}';
	}

}
