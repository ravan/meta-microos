SUMMARY = "Qt5 Configuration Tool"
DESCRIPTION = "This applications allows users to configure Qt5 settings (theme, font, \
icons, etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "1.8"

RPM_NAME = "qt5ct-1.8-1.11.aarch64.rpm"
RPM_HASH = "c67a4c1090d89b068f3130f380a42706e3ca6305f17a37b8409413e73d3532ae377acc4c3374d033019c946265398da473a19cd035f0c7eb8764a07411d05833"

RPROVIDES:${PN} += "config-qt5ct \
libqt5-qtct \
libqt5ct-common.so.1.8 \
libqt5ct-style.so \
libqt5ct.so \
qt5ct"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
