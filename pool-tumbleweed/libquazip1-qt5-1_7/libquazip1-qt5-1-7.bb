SUMMARY = "C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libquazip1-qt5-1_7-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "0477afceefe3beadffd9072311ee87a1085f5f51757522b09b6f82e59898ec7eab32a1ee9ce701ae7b11c21aa84687e6ea1a482c6a5d3bcf15488cdf192542f5"

RPROVIDES:${PN} += "libquazip1 \
libquazip1-qt5-1-7 \
libquazip1-qt5.so.1.7 \
libquazip5-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
