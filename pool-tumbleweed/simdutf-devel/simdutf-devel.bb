SUMMARY = "Development files for simdutf"
DESCRIPTION = "The package contains libraries and header files for developing applications \
that use simdutf."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "9.1.2"

RPM_NAME = "simdutf-devel-9.1.2-1.1.aarch64.rpm"
RPM_HASH = "e2ac22a0e82499f83793589c078e4fa8e316d94db45bef929a2bd3cf3e83f2603e3826896380ab60826a4e27049ca2b7819c011983b86c555f0d4176e5087abf"

RPROVIDES:${PN} += "cmake-simdutf \
pkgconfig-simdutf \
simdutf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsimdutf35"

inherit rpm
