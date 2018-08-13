package GolangUtils

import "testing"

/*
是否为公网有效IP
是：true
*/
func TestIsValidIp(t *testing.T) {
	if IsValidIp("192.168.1.1") {
		t.Fatal("wrong")
	}
	if !IsValidIp("39.6.6.7") {
		t.Fatal("wrong")
	}
	if IsValidIp("10.8.125.1") {
		t.Fatal("wrong")
	}
	if IsValidIp("8.8.8.8") {
		t.Fatal("wrong")
	}
}
