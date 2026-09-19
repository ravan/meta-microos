SUMMARY = "Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.38.0"

RPM_NAME = "libyaz5-5.38.0-1.1.aarch64.rpm"
RPM_HASH = "312f1c1280d2dbd5efa6a03d098744c18cabc3665198c3a364f2f1bb1feda26fccc11e1d964499aa6a78949f5023a0c57a946654eae60a35eb370cf9c555012d"

RPROVIDES:${PN} += "libyaz \
libyaz-icu.so.5 \
libyaz-server.so.5 \
libyaz.so.5 \
libyaz5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libgnutls.so.30 \
libicui18n.so.78 \
libicuuc.so.78 \
libwrap.so.0 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
