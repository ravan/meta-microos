SUMMARY = "Libyui - Qt (graphical) user interface"
DESCRIPTION = "This package contains the Qt (graphical) user interface component \
for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt16-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "4820128bb86fc2b7248305eaeac0c9dd2a1ed2c41c6f7fb8dea1e7d3e33fc5d9d208823d6aaeb699f4f6aaf02d5832c79884625c4ae183e28fbd63f90b06c4b0"

RPROVIDES:${PN} += "libyui-qt \
libyui-qt.so.16 \
libyui-qt16 \
yast2-qt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyui.so.16 \
libyui16"

inherit rpm
