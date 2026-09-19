SUMMARY = "Snowball compiler and stemming algorithms"
DESCRIPTION = "Snowball is a small string processing language for creating stemming algorithms \
for use in Information Retrieval, plus a collection of stemming algorithms \
implemented using it. \
 \
Snowball was originally designed and built by Martin Porter. Martin retired \
from development in 2014 and Snowball is now maintained as a community project. \
Martin originally chose the name Snowball as a tribute to SNOBOL, the excellent \
string handling language from the 1960s. It now also serves as a metaphor for \
how the project grows by gathering contributions over time. \
 \
The Snowball compiler translates a Snowball program into source code in another \
language - currently ISO C, C#, Go, Java, Javascript, Object Pascal, Python and \
Rust are supported."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "snowball-3.0.1-1.5.aarch64.rpm"
RPM_HASH = "83917a5c030ce1b356a0868e305ac5848a7fa33efa8ece14927428eec60e77828684686fe141f687228535b5f9a3189f825036afcfdd783deff99d8c200847ff"

RPROVIDES:${PN} += "libstemmer-tools \
snowball"

RDEPENDS:${PN} += "libc.so.6 \
libstemmer.so.0d"

inherit rpm
