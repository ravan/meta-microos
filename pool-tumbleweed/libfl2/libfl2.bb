SUMMARY = "Libraries for flex"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text. \
 \
This package contains libraries for using flex."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "libfl2-2.6.4-7.10.aarch64.rpm"
RPM_HASH = "59b0dd8f72c3de32946d194c3c144134e7e3119c40537a6a30a06245fa5f6372ed104d8ffef756df86ed43dc49d3ff5b9543732bbedcda886b9e70d2beda2fab"

RPROVIDES:${PN} += "libfl.so.2 \
libfl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
