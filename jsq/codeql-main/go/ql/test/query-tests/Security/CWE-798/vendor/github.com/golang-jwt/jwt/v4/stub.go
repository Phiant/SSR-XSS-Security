// Code generated by depstubber. DO NOT EDIT.
// This is a simple stub for github.com/golang-jwt/jwt/v4, strictly for use in testing.

// See the LICENSE file for information about the licensing of the original library.
// Source: github.com/golang-jwt/jwt/v4 (exports: MapClaims,RegisteredClaims,SigningMethodRSA,SigningMethodHMAC,Token; functions: NewNumericDate,NewWithClaims,New)

// Package jwt is a stub of github.com/golang-jwt/jwt/v4, generated by depstubber.
package jwt

import (
	crypto "crypto"
	time "time"
)

type ClaimStrings []string

func (_ ClaimStrings) MarshalJSON() ([]byte, error) {
	return nil, nil
}

func (_ *ClaimStrings) UnmarshalJSON(_ []byte) error {
	return nil
}

type Claims interface {
	Valid() error
}

type MapClaims map[string]interface{}

func (_ MapClaims) Valid() error {
	return nil
}

func (_ MapClaims) VerifyAudience(_ string, _ bool) bool {
	return false
}

func (_ MapClaims) VerifyExpiresAt(_ int64, _ bool) bool {
	return false
}

func (_ MapClaims) VerifyIssuedAt(_ int64, _ bool) bool {
	return false
}

func (_ MapClaims) VerifyIssuer(_ string, _ bool) bool {
	return false
}

func (_ MapClaims) VerifyNotBefore(_ int64, _ bool) bool {
	return false
}

func New(_ SigningMethod) *Token {
	return nil
}

func NewNumericDate(_ time.Time) *NumericDate {
	return nil
}

func NewWithClaims(_ SigningMethod, _ Claims) *Token {
	return nil
}

type NumericDate struct {
	Time time.Time
}

func (_ NumericDate) Add(_ time.Duration) time.Time {
	return time.Time{}
}

func (_ NumericDate) AddDate(_ int, _ int, _ int) time.Time {
	return time.Time{}
}

func (_ NumericDate) After(_ time.Time) bool {
	return false
}

func (_ NumericDate) AppendFormat(_ []byte, _ string) []byte {
	return nil
}

func (_ NumericDate) Before(_ time.Time) bool {
	return false
}

func (_ NumericDate) Clock() (int, int, int) {
	return 0, 0, 0
}

func (_ NumericDate) Date() (int, time.Month, int) {
	return 0, 0, 0
}

func (_ NumericDate) Day() int {
	return 0
}

func (_ NumericDate) Equal(_ time.Time) bool {
	return false
}

func (_ NumericDate) Format(_ string) string {
	return ""
}

func (_ NumericDate) GoString() string {
	return ""
}

func (_ NumericDate) GobEncode() ([]byte, error) {
	return nil, nil
}

func (_ NumericDate) Hour() int {
	return 0
}

func (_ NumericDate) ISOWeek() (int, int) {
	return 0, 0
}

func (_ NumericDate) In(_ *time.Location) time.Time {
	return time.Time{}
}

func (_ NumericDate) IsDST() bool {
	return false
}

func (_ NumericDate) IsZero() bool {
	return false
}

func (_ NumericDate) Local() time.Time {
	return time.Time{}
}

func (_ NumericDate) Location() *time.Location {
	return nil
}

func (_ NumericDate) MarshalBinary() ([]byte, error) {
	return nil, nil
}

func (_ NumericDate) MarshalJSON() ([]byte, error) {
	return nil, nil
}

func (_ NumericDate) MarshalText() ([]byte, error) {
	return nil, nil
}

func (_ NumericDate) Minute() int {
	return 0
}

func (_ NumericDate) Month() time.Month {
	return 0
}

func (_ NumericDate) Nanosecond() int {
	return 0
}

func (_ NumericDate) Round(_ time.Duration) time.Time {
	return time.Time{}
}

func (_ NumericDate) Second() int {
	return 0
}

func (_ NumericDate) String() string {
	return ""
}

func (_ NumericDate) Sub(_ time.Time) time.Duration {
	return 0
}

func (_ NumericDate) Truncate(_ time.Duration) time.Time {
	return time.Time{}
}

func (_ NumericDate) UTC() time.Time {
	return time.Time{}
}

func (_ NumericDate) Unix() int64 {
	return 0
}

func (_ NumericDate) UnixMicro() int64 {
	return 0
}

func (_ NumericDate) UnixMilli() int64 {
	return 0
}

func (_ NumericDate) UnixNano() int64 {
	return 0
}

func (_ NumericDate) Weekday() time.Weekday {
	return 0
}

func (_ NumericDate) Year() int {
	return 0
}

func (_ NumericDate) YearDay() int {
	return 0
}

func (_ NumericDate) Zone() (string, int) {
	return "", 0
}

func (_ NumericDate) ZoneBounds() (time.Time, time.Time) {
	return time.Time{}, time.Time{}
}

func (_ *NumericDate) GobDecode(_ []byte) error {
	return nil
}

func (_ *NumericDate) UnmarshalBinary(_ []byte) error {
	return nil
}

func (_ *NumericDate) UnmarshalJSON(_ []byte) error {
	return nil
}

func (_ *NumericDate) UnmarshalText(_ []byte) error {
	return nil
}

type RegisteredClaims struct {
	Issuer    string
	Subject   string
	Audience  ClaimStrings
	ExpiresAt *NumericDate
	NotBefore *NumericDate
	IssuedAt  *NumericDate
	ID        string
}

func (_ RegisteredClaims) Valid() error {
	return nil
}

func (_ *RegisteredClaims) VerifyAudience(_ string, _ bool) bool {
	return false
}

func (_ *RegisteredClaims) VerifyExpiresAt(_ time.Time, _ bool) bool {
	return false
}

func (_ *RegisteredClaims) VerifyIssuedAt(_ time.Time, _ bool) bool {
	return false
}

func (_ *RegisteredClaims) VerifyIssuer(_ string, _ bool) bool {
	return false
}

func (_ *RegisteredClaims) VerifyNotBefore(_ time.Time, _ bool) bool {
	return false
}

type SigningMethod interface {
	Alg() string
	Sign(_ string, _ interface{}) (string, error)
	Verify(_ string, _ string, _ interface{}) error
}

type SigningMethodHMAC struct {
	Name string
	Hash crypto.Hash
}

func (_ *SigningMethodHMAC) Alg() string {
	return ""
}

func (_ *SigningMethodHMAC) Sign(_ string, _ interface{}) (string, error) {
	return "", nil
}

func (_ *SigningMethodHMAC) Verify(_ string, _ string, _ interface{}) error {
	return nil
}

type SigningMethodRSA struct {
	Name string
	Hash crypto.Hash
}

func (_ *SigningMethodRSA) Alg() string {
	return ""
}

func (_ *SigningMethodRSA) Sign(_ string, _ interface{}) (string, error) {
	return "", nil
}

func (_ *SigningMethodRSA) Verify(_ string, _ string, _ interface{}) error {
	return nil
}

type Token struct {
	Raw       string
	Method    SigningMethod
	Header    map[string]interface{}
	Claims    Claims
	Signature string
	Valid     bool
}

func (_ *Token) SignedString(_ interface{}) (string, error) {
	return "", nil
}

func (_ *Token) SigningString() (string, error) {
	return "", nil
}
