SUMMARY = "Development files for libgtop"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "2.41.3+4"

RPM_NAME = "libgtop-devel-2.41.3+4-3.3.aarch64.rpm"
RPM_HASH = "ee358fc3f004b7448b202915719a94ed1ee084cf23c529b87090b7fa311dec5c0dd05b4884650d30eec3851255031919ce5971e57d9092c559fde084c333d447"

RPROVIDES:${PN} += "libgtop-devel \
pkgconfig-libgtop-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgtop-2-0-11 \
pkgconfig-glib-2.0 \
typelib-1-0-GTop-2-0"

inherit rpm
