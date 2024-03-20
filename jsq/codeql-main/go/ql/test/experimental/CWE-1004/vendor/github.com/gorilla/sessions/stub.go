// Code generated by depstubber. DO NOT EDIT.
// This is a simple stub for github.com/gorilla/sessions, strictly for use in testing.

// See the LICENSE file for information about the licensing of the original library.
// Source: github.com/gorilla/sessions (exports: CookieStore; functions: NewCookieStore)

// Package sessions is a stub of github.com/gorilla/sessions, generated by depstubber.
package sessions

import (
	http "net/http"
)

type CookieStore struct {
	Codecs  []interface{}
	Options *Options
}

func (_ *CookieStore) Get(_ *http.Request, _ string) (*Session, error) {
	return nil, nil
}

func (_ *CookieStore) MaxAge(_ int) {}

func (_ *CookieStore) New(_ *http.Request, _ string) (*Session, error) {
	return nil, nil
}

func (_ *CookieStore) Save(_ *http.Request, _ http.ResponseWriter, _ *Session) error {
	return nil
}

func NewCookieStore(_ ...[]byte) *CookieStore {
	return nil
}

type Options struct {
	Path     string
	Domain   string
	MaxAge   int
	Secure   bool
	HttpOnly bool
	SameSite http.SameSite
}

type Session struct {
	ID      string
	Values  map[interface{}]interface{}
	Options *Options
	IsNew   bool
}

func (_ *Session) AddFlash(_ interface{}, _ ...string) {}

func (_ *Session) Flashes(_ ...string) []interface{} {
	return nil
}

func (_ *Session) Name() string {
	return ""
}

func (_ *Session) Save(_ *http.Request, _ http.ResponseWriter) error {
	return nil
}

func (_ *Session) Store() Store {
	return nil
}

type Store interface {
	Get(_ *http.Request, _ string) (*Session, error)
	New(_ *http.Request, _ string) (*Session, error)
	Save(_ *http.Request, _ http.ResponseWriter, _ *Session) error
}
