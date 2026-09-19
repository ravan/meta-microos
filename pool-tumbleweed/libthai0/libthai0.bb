SUMMARY = "Thai Language Support Routines"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.30"

RPM_NAME = "libthai0-0.1.30-1.4.aarch64.rpm"
RPM_HASH = "3750d0cfada49bafc27a02c9cbf5f18775637fd324d3004f9b0655bd37007aa431e2ea886baa3f97697d601d6bfd0e942cae969b3ec5f431292bffc41f309057"

RPROVIDES:${PN} += "libthai \
libthai.so.0 \
libthai0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdatrie.so.1 \
libthai-data"

inherit rpm
