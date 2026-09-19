SUMMARY = "Header files, libraries and development documentation for libqalculate"
DESCRIPTION = "This package contains the header files and development \
documentation for libqalculate. If you like to develop programs using libqalculate, \
you will need to install libqalculate-devel."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "libqalculate-devel-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "6075b5f4a968ef6d9374c2804170370d110ea27b6b69110302b12983c171ef628c125845e06e2d095e48e3b11f80f5c51fc28236e50c1ab2952ff0741e4239f8"

RPROVIDES:${PN} += "libqalculate-devel \
pkgconfig-libqalculate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libqalculate \
pkgconfig-libxml-2.0 \
pkgconfig-mpfr"

inherit rpm
