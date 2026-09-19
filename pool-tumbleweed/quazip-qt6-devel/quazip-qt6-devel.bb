SUMMARY = "Development files for quazip-qt6"
DESCRIPTION = "The quazip-qt6-devel package contains libraries and header files for \
developing applications that use quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "quazip-qt6-devel-1.7.2-1.2.aarch64.rpm"
RPM_HASH = "9fd3a9f8ec39e771a5a41315202c39a655b9015f546c402f077c6dfa21c8ddf36f0fe5c8e3c1d2ebd4bd36029757724d5891e10750bde0601feea9d57c193c54"

RPROVIDES:${PN} += "cmake-QuaZip-Qt6 \
pkgconfig-quazip1-qt6 \
quazip-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Core5Compat \
libquazip1-qt6-1-7 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Core5Compat \
pkgconfig-bzip2 \
pkgconfig-zlib"

inherit rpm
