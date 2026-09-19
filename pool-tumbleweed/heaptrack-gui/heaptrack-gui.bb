SUMMARY = "GUI Frontend for Heaptrack"
DESCRIPTION = "A Qt5/KF5 based GUI for Heaptrack."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "heaptrack-gui-1.5.0-6.8.aarch64.rpm"
RPM_HASH = "1aa82910e02210258d0bcc078e2f60589b37b71ef1acb20ed77905761c3b010b3ed3637b1ee9f38b7a934f75000d82cee29474779feff6352039c5d0d644b4e8"

RPROVIDES:${PN} += "heaptrack-gui"

RDEPENDS:${PN} += "heaptrack \
ld-linux-aarch64.so.1 \
libKChart.so.2 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
