SUMMARY = "RSS Parsing Library"
DESCRIPTION = "libmRSS is a C library for parsing, writing, and creating RSS (Rich Site \
Summary, Really Simple Syndication, and RDF Site Summary) and ATOM files or \
streams. The formats supported are: RSS 0.91, RSS 0.92, RSS 1.0, RSS 2.0, ATOM \
0.3, and ATOM 1.0."
LICENSE = "LGPL-2.1-only"

PV = "0.19.3"

RPM_NAME = "libmrss0-0.19.3-1.12.aarch64.rpm"
RPM_HASH = "b929e054d5a7355b7a15b902815e7e030fe39052321419115e3434f67033f41f34bf02c139d21b806e815c9ce347ebf3251d81de5de7e241a5eebac259c5c933"

RPROVIDES:${PN} += "libmrss.so.0 \
libmrss0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libnxml.so.0"

inherit rpm
