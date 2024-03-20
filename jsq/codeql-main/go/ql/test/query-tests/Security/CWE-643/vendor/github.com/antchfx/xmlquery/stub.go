// Code generated by depstubber. DO NOT EDIT.
// This is a simple stub for github.com/antchfx/xmlquery, strictly for use in testing.

// See the LICENSE file for information about the licensing of the original library.
// Source: github.com/antchfx/xmlquery (exports: Node; functions: Find,FindOne,FindEach,FindEachWithBreak,QueryAll,Query)

// Package xmlquery is a stub of github.com/antchfx/xmlquery, generated by depstubber.
package xmlquery

import (
	xml "encoding/xml"
)

func Find(_ *Node, _ string) []*Node {
	return nil
}

func FindEach(_ *Node, _ string, _ func(int, *Node)) {}

func FindEachWithBreak(_ *Node, _ string, _ func(int, *Node) bool) {}

func FindOne(_ *Node, _ string) *Node {
	return nil
}

type Node struct {
	Parent       *Node
	FirstChild   *Node
	LastChild    *Node
	PrevSibling  *Node
	NextSibling  *Node
	Type         NodeType
	Data         string
	Prefix       string
	NamespaceURI string
	Attr         []xml.Attr
}

func (_ *Node) InnerText() string {
	return ""
}

func (_ *Node) OutputXML(_ bool) string {
	return ""
}

func (_ *Node) SelectAttr(_ string) string {
	return ""
}

func (_ *Node) SelectElement(_ string) *Node {
	return nil
}

func (_ *Node) SelectElements(_ string) []*Node {
	return nil
}

type NodeType uint

func Query(_ *Node, _ string) (*Node, error) {
	return nil, nil
}

func QueryAll(_ *Node, _ string) ([]*Node, error) {
	return nil, nil
}
