SUMMARY = "Development files for the SPDY C Library"
DESCRIPTION = "This is an experimental implementation of Google’s SPDY protocol in \
C. This library provides SPDY version 2, 3 and 3.1 framing layer \
implementation. It does not perform any I/O operations but uses \
callback functions provided by the application. Likewise, it includes \
no event polling mechanism, so the application can freely choose. \
There is no dependency on a particular SSL library. \
 \
This package holds the development files."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "spdylay-devel-1.4.0-3.38.aarch64.rpm"
RPM_HASH = "c8e6cb97a33fd5848951da3e970213f6748c4db604d82bbe27294738350112d090c0b650f2115749210b31d5138940dd38db7871164cc31fa6ebe7c6b0fb948c"

RPROVIDES:${PN} += "pkgconfig-libspdylay \
spdylay-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspdylay7 \
pkgconfig-zlib"

inherit rpm
