SUMMARY = "Command-line parsing library that parses GNU-style command-line options"
DESCRIPTION = "A single-file, ANSI C, command-line parsing library that parses GNU-style \
command-line options. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "libargtable3-3-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "6e70f8f39918d41fd4ab885b4f643e2a7fd4d92399a9cce70f1c007d385c1f91b366a7e7d4fb5eb1a59467f4d87e535cd7d70ed7ad789e431c2d127cae098e7a"

RPROVIDES:${PN} += "libargtable3-3 \
libargtable3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
