SUMMARY = "HTTP request/response parser for C"
DESCRIPTION = "This is a parser for HTTP messages written in C. It parses both \
requests and responses. The parser is designed to be used in \
performance HTTP applications. It does not make any syscalls nor \
allocations, it does not buffer data, it can be interrupted at \
anytime. Depending on your architecture, it only requires about 40 \
bytes of data per message stream (in a web server that is per \
connection)."
LICENSE = "MIT"

PV = "2.9.4"

RPM_NAME = "libhttp_parser2_9-2.9.4-1.21.aarch64.rpm"
RPM_HASH = "4ad0b70eb18b15e752aaa67572396f0ef878326d332b865ef90759a6848774eaebee49000c57cde5c279bfb4a5531a5cb694a6aed91eb3badcd6669cb534b224"

RPROVIDES:${PN} += "libhttp-parser-suse0 \
libhttp-parser.so.2.9 \
libhttp-parser2-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
