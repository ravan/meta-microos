SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "libqca-qt5-2-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "f22377e9ea9d7342b43ad0e2f8402cdfc0ad4afb1a9198a0c3df24ee1f7ec0d6dea66c7a7a881e7a3dff923322d9681aac0078a96cc20bac1ce4cc2bcdce238b"

RPROVIDES:${PN} += "libqca-qt5 \
libqca-qt5-2 \
libqca-qt5.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qca-qt5"

inherit rpm
