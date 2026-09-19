SUMMARY = "A small utility which generates Go code from any file"
DESCRIPTION = "This package converts any file into manageable Go source code. Useful for embedding binary data into a go program. The file data is optionally gzip compressed before being converted to a raw byte slice. \
 \
It comes with a command line tool in the go-bindata sub directory. This tool offers a set of command line options, used to customize the output being generated."
LICENSE = "CC0-1.0"

PV = "3.0.7+git20151023.72.a0ff256"

RPM_NAME = "golang-github-jteeuwen-go-bindata-3.0.7+git20151023.72.a0ff256-5.30.aarch64.rpm"
RPM_HASH = "e74c66031ad54d5f9f9a6ec13a846e35717fa8904b6252172778732552e178072b77c5263119b45581dd1eae1b7428117807bc4cc112131137cb5bd4f51beaa8"

RPROVIDES:${PN} += "go-bindata \
golang-github-jteeuwen-go-bindata \
golang-github.com/jteeuwen/go-bindata"

RDEPENDS:${PN} += ""

inherit rpm
