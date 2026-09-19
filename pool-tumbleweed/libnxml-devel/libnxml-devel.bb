SUMMARY = "XML Parsing Library"
DESCRIPTION = "nXML is a C library for parsing, writing and creating XML 1.0 and 1.1 files or \
streams. It supports UTF-8, UTF-16be and UTF-16le, UCS-4 (1234, 4321, 2143, \
2312)."
LICENSE = "LGPL-2.1+"

PV = "0.18.3"

RPM_NAME = "libnxml-devel-0.18.3-2.9.aarch64.rpm"
RPM_HASH = "6623cf52cca505ec575e06af5a7de5ae73a508369cd14b8a93d2c51ca049727311daf9c4a1dff726a73e310c27556344824ed569bde9a4583334ba7258602d7e"

RPROVIDES:${PN} += "libnxml-devel \
pkgconfig-nxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcurl-devel \
libnxml0"

inherit rpm
