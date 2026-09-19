SUMMARY = "Header files for ulfius"
DESCRIPTION = "Development and header files for libulfius."
LICENSE = "MIT"

PV = "2.7.15"

RPM_NAME = "ulfius-devel-2.7.15-2.1.aarch64.rpm"
RPM_HASH = "33aaf41d6090fe29c6979acbcf9c099321b4fea0b2b11e142f4edb5814bbf021f5de5e4b833146dc968ab9c2a7b51533e1fa38bcd04f56b1edf58b12b49faa93"

RPROVIDES:${PN} += "cmake-Ulfius \
pkgconfig-libulfius \
ulfius-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcurl-devel \
libgnutls-devel \
libjansson-devel \
libmicrohttpd-devel \
libulfius2-7 \
orcania-devel \
pkgconfig-gnutls \
pkgconfig-jansson \
pkgconfig-libcurl \
pkgconfig-libmicrohttpd \
pkgconfig-liborcania \
pkgconfig-libyder \
yder-devel \
zlib-devel"

inherit rpm
