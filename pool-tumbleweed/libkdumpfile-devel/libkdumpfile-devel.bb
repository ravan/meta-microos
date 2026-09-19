SUMMARY = "Include files and libraries for libkdumpfile development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libkdumpfile."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.6"

RPM_NAME = "libkdumpfile-devel-0.5.6-3.5.aarch64.rpm"
RPM_HASH = "0325bcc1482c4919b5116fa779ad81651145e81d4d542b08955b3033331a2465232c5fe2564fd36c518defafa0a9666238bc480ebc6ff9cb999931d428a1fe23"

RPROVIDES:${PN} += "libkdumpfile-devel \
pkgconfig-libkdumpfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkdumpfile12 \
pkgconfig-libaddrxlat \
pkgconfig-libzstd \
pkgconfig-lzo2 \
pkgconfig-snappy \
pkgconfig-zlib"

inherit rpm
