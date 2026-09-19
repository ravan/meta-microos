SUMMARY = "XML Parsing Library"
DESCRIPTION = "nXML is a C library for parsing, writing and creating XML 1.0 and 1.1 files or \
streams. It supports UTF-8, UTF-16be and UTF-16le, UCS-4 (1234, 4321, 2143, \
2312)."
LICENSE = "LGPL-2.1+"

PV = "0.18.3"

RPM_NAME = "libnxml0-0.18.3-2.9.aarch64.rpm"
RPM_HASH = "9db65329b0b8edae19547a441e81fdd42173707aa8eb55bb067c7686fb7f3157661f04144ad46aadd21fd1fa5a4a1875344bf3af0d36fb2008828524339dac24"

RPROVIDES:${PN} += "libnxml.so.0 \
libnxml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
