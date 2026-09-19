SUMMARY = "Development headers and libraries for http-parser"
DESCRIPTION = "This is a parser for HTTP messages written in C. It parses both \
requests and responses. The parser is designed to be used in \
performance HTTP applications. It does not make any syscalls nor \
allocations, it does not buffer data, it can be interrupted at \
anytime. Depending on your architecture, it only requires about 40 \
bytes of data per message stream (in a web server that is per \
connection). \
 \
Development headers and libraries for http-parser."
LICENSE = "MIT"

PV = "2.9.4"

RPM_NAME = "http-parser-devel-2.9.4-1.21.aarch64.rpm"
RPM_HASH = "bd748f85185e9e5b6c3e1964b1718d558737114c5624dd8415b5d7acd13be3999a33d4dfe8bb509d7077e14ec443d9aeca2f5abafc94b0859e60ffc3ce02f771"

RPROVIDES:${PN} += "http-parser-devel"

RDEPENDS:${PN} += "libhttp-parser2-9"

inherit rpm
