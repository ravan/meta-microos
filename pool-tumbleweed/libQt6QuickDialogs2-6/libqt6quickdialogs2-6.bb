SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickDialogs2-6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "140483fe3aea6e7c5c6d9dd09faf9b240441d5c9cf4af5cbce43c5a7cbbdcc05405e2b50f676945ceee7eae014358bd82a55e83fd30c1e4dddadaa10637d84e4"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 \
libQt6QuickDialogs2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
