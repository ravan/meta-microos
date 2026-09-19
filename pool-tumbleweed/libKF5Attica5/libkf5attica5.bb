SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Attica5-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "3d7bc7420a590a194ce7d864aa3326cfbebd7461fb71c2fbc8dad5e76f111cfb44d4d7c0243f06830bc67cfbc7f81659bfcc23b32210e22714103c1630047717"

RPROVIDES:${PN} += "libKF5Attica.so.5 \
libKF5Attica5"

RDEPENDS:${PN} += "/sbin/ldconfig \
attica-qt5 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
