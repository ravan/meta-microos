SUMMARY = "LightDM Qt6-based Client Library"
DESCRIPTION = "A Qt5-based library for LightDM clients to use to interface with \
LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-qt6-3-0-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "8e919bf09e0e67ab230ac3fbf793b11acf375fd2001f888fe10b12321126dcadcd061529bb019bb08464a2bb8350cfb4f783c46c5887eaa5f115131b0779d327"

RPROVIDES:${PN} += "liblightdm-qt6-3-0 \
liblightdm-qt6-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblightdm-gobject-1.so.0 \
libstdc++.so.6"

inherit rpm
