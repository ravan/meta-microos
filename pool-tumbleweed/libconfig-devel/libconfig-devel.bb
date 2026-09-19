SUMMARY = "Headers for libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the headers and cmake files for both \
the C and C++ APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "libconfig-devel-1.8.1-1.7.aarch64.rpm"
RPM_HASH = "803cc823286b3a2751d8ea376d8368f9a714550298349e4327147e9f9b1a20886db7052b1318aa80be511154e99e4f88b91a7baed64a0c1aee3c43c390a428ac"

RPROVIDES:${PN} += "libconfig++-devel \
libconfig-devel \
pkgconfig-libconfig \
pkgconfig-libconfig++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libconfig++15 \
libconfig15"

inherit rpm
