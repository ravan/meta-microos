SUMMARY = "PDF parsing and creation library"
DESCRIPTION = "A cross platform PDF parsing and creation library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libpodofo4-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "09c750fcc2013f3a62e022c433f024aab31e5b12c62b239b04e2456279f5d6bf3a59347d4ece9eb296097156ce67cca552d4fefa535e414e8847b7ecdbe350f4"

RPROVIDES:${PN} += "libpodofo.so.4 \
libpodofo4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
