// Code generated by https://github.com/gagliardetto/codebox. DO NOT EDIT.

package main

import "crypto/cipher"

func TaintStepTest_CryptoCipherStreamReaderRead_B0I0O0(sourceCQL interface{}) interface{} {
	fromStreamReader656 := sourceCQL.(cipher.StreamReader)
	var intoByte414 []byte
	fromStreamReader656.Read(intoByte414)
	return intoByte414
}

func TaintStepTest_CryptoCipherStreamWriterWrite_B0I0O0(sourceCQL interface{}) interface{} {
	fromByte518 := sourceCQL.([]byte)
	var intoStreamWriter650 cipher.StreamWriter
	intoStreamWriter650.Write(fromByte518)
	return intoStreamWriter650
}

func TaintStepTest_CryptoCipherBlockDecrypt_B0I0O0(sourceCQL interface{}) interface{} {
	fromByte784 := sourceCQL.([]byte)
	var intoByte957 []byte
	var mediumObjCQL cipher.Block
	mediumObjCQL.Decrypt(intoByte957, fromByte784)
	return intoByte957
}

func TaintStepTest_CryptoCipherAEADOpen_B0I0O0(sourceCQL interface{}) interface{} {
	fromByte520 := sourceCQL.([]byte)
	var intoByte443 []byte
	var mediumObjCQL cipher.AEAD
	mediumObjCQL.Open(intoByte443, nil, fromByte520, nil)
	return intoByte443
}

func TaintStepTest_CryptoCipherAEADOpen_B0I0O1(sourceCQL interface{}) interface{} {
	fromByte127 := sourceCQL.([]byte)
	var mediumObjCQL cipher.AEAD
	intoByte483, _ := mediumObjCQL.Open(nil, nil, fromByte127, nil)
	return intoByte483
}

func RunAllTaints_CryptoCipher() {
	{
		source := newSource(0)
		out := TaintStepTest_CryptoCipherStreamReaderRead_B0I0O0(source)
		sink(0, out)
	}
	{
		source := newSource(1)
		out := TaintStepTest_CryptoCipherStreamWriterWrite_B0I0O0(source)
		sink(1, out)
	}
	{
		source := newSource(2)
		out := TaintStepTest_CryptoCipherBlockDecrypt_B0I0O0(source)
		sink(2, out)
	}
	{
		source := newSource(3)
		out := TaintStepTest_CryptoCipherAEADOpen_B0I0O0(source)
		sink(3, out)
	}
	{
		source := newSource(4)
		out := TaintStepTest_CryptoCipherAEADOpen_B0I0O1(source)
		sink(4, out)
	}
}
