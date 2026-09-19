SUMMARY = "CLI tool and library to compile and run WebAssembly"
DESCRIPTION = "wazero is a WebAssembly Core Specification 1.0 and 2.0 compliant runtime written \
in Go. It has zero dependencies, and doesn't rely on CGO. This means you can run \
applications in other languages and still keep cross compilation."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "wazero-1.9.0-1.8.aarch64.rpm"
RPM_HASH = "47e56ee203bc0fb50acbfd70dc006cc0e5b838f1e708a5e717b146193591d7b10b9752c583d5d8ce5b12f4e178b74e966e68d1054030f9ec92d6b3bdf1421582"

RPROVIDES:${PN} += "wazero"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
