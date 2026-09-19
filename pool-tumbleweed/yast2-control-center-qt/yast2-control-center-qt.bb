SUMMARY = "YaST2 - Control Center (Qt Version)"
DESCRIPTION = "This package contains the menu selection component for YaST2 using the \
Qt toolkit."
LICENSE = "GPL-2.0-only"

PV = "5.0.3"

RPM_NAME = "yast2-control-center-qt-5.0.3-1.5.aarch64.rpm"
RPM_HASH = "82ea9eeefd61edb9ee40caedd2b885207682c0d5804a9370b0fa534fad8318b308f51137c8648d410b2d5c50d76f1bb7c40f5b35b9a2130d38dd834219cddc78"

RPROVIDES:${PN} += "yast2-control-center-/usr/lib/YaST2/bin/y2controlcenter \
yast2-control-center-binary \
yast2-control-center-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui-qt \
xdg-utils \
yast2-control-center"

inherit rpm
