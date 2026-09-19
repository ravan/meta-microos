SUMMARY = "GnuCOBOL shared library"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "libcob4-3.2-4.2.aarch64.rpm"
RPM_HASH = "018a2ff7039fb18a79e3c0667efbb90e5c16be07e65af960e684c6b5f2eefc75e6cd65913a843c0c54b253a83d9b1493094becac2b6d52a14d0eaa6b60436a83"

RPROVIDES:${PN} += "libcob.so.4 \
libcob4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgmp.so.10 \
libjson-c.so.5 \
libncursesw.so.6 \
libtinfo.so.6 \
libxml2.so.16"

inherit rpm
