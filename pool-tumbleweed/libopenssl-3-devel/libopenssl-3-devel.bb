SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "libopenssl-3-devel-3.5.3-8.3.aarch64.rpm"
RPM_HASH = "b682e53409162cfa0cbe24b460cdca668d36377c0ed1101c8a6591cf26540e987f23fb2a4305f3c449a53d6a3749d9975d933fc67976da5a03459d900eb47ee8"

RPROVIDES:${PN} += "libopenssl-3-devel \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-openssl \
ssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
jitterentropy-devel \
libopenssl3 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
