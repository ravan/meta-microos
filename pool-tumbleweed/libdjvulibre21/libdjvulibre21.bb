SUMMARY = "DjVu rendering library"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.30"

RPM_NAME = "libdjvulibre21-3.5.30-1.3.aarch64.rpm"
RPM_HASH = "ef30c6f3503325ecb5f217fae64a68f793cd39ccac847c4194523f1cb6fba9806cd2495d0c05835f2c82fa6286144b6f6843b6411b9a2d7f07e23050684399bc"

RPROVIDES:${PN} += "libdjvulibre.so.21 \
libdjvulibre21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
