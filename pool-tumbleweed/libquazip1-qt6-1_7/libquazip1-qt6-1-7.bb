SUMMARY = "C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libquazip1-qt6-1_7-1.7.2-1.2.aarch64.rpm"
RPM_HASH = "3cde9b9b05d6548158f75a13ade8f023da2512d1254c31d07b1d939627fc6a85d66633e2f291c97ce5212f9c6b7ed73cae075917f0d886cec3c0aef2e9023b21"

RPROVIDES:${PN} += "libquazip1-qt6-1-7 \
libquazip1-qt6.so.1.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
