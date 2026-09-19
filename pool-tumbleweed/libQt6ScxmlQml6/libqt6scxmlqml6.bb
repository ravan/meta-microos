SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6ScxmlQml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c69792b9ba5402680ca7f86452ae93c060a309b85ac21f21d0e77eff033b7a8db2b82e8fbabe52ae7d587bfb57a782eb033f42200b39a80110927d5ba82a138e"

RPROVIDES:${PN} += "libQt6ScxmlQml.so.6 \
libQt6ScxmlQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
