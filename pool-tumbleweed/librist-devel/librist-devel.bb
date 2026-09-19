SUMMARY = "Development files for librist"
DESCRIPTION = "The librist-devel package contains libraries and header files for \
developing applications that use librist."
LICENSE = "BSD-2-Clause"

PV = "0.2.20"

RPM_NAME = "librist-devel-0.2.20-1.1.aarch64.rpm"
RPM_HASH = "239453c0146091e3a460b1b6923d891488279ccf8a527da7e155ecb8c0738f8abc08175916271fb3c7c5b949ed220e289f44803c3ddcd9524ff6228bf9d14494"

RPROVIDES:${PN} += "librist-devel \
pkgconfig-librist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librist4 \
pkgconfig-gmp \
pkgconfig-gnutls \
pkgconfig-hogweed \
pkgconfig-libcjson \
pkgconfig-nettle"

inherit rpm
