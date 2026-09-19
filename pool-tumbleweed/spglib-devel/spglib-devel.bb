SUMMARY = "Development files for spglib/libsymspg"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "spglib-devel-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "6b96bcb19d7ad1675ed1789df6b79df137113cc8c058f2691fdfeca0605fc5d46df83597ce77f0502acc0ed46a26a60be1b0d0d1017abac9b365dbefeb92dbc9"

RPROVIDES:${PN} += "cmake-Spglib \
pkgconfig-spglib \
spglib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsymspg2"

inherit rpm
