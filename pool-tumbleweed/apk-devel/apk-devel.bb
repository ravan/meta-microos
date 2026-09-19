SUMMARY = "Development files for apk"
DESCRIPTION = "Alpine Package Keeper (apk) is a package manager originally built for \
Alpine Linux, but now used by several other distributions as well. \
 \
This package contains headers and libraries required to build applications \
that use libapk."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "apk-devel-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "448f87cd1b466396bc1cc822e05d4f933de7e83061c10057fe7621bf57565f73cd144404ab51a8ecfc972a1cb9438ba3457e894c081cb7a07d732d7dfb7fb3aa"

RPROVIDES:${PN} += "apk-devel \
pkgconfig-apk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapk3-0-0 \
pkgconfig-libzstd \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
