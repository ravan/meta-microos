SUMMARY = "Graphical wireless scanning for Linux"
DESCRIPTION = "LinSSID is graphically and functionally similar to Inssider (from \
Microsoft Windows). \
It is written in C++ using Linux wireless tools and Qt5."
LICENSE = "GPL-3.0-only"

PV = "3.6"

RPM_NAME = "linssid-3.6-4.3.aarch64.rpm"
RPM_HASH = "4cfc00eb41335d52de78171e0d051fb0619385f1aa5e7761b65217950135b4784aec13b702d236635d338b9f4d52320140ef0ba11947e74f2ab8d2a93f17a70d"

RPROVIDES:${PN} += "linssid"

RDEPENDS:${PN} += "iw \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqwt-qt5.so.6.3 \
libstdc++.so.6"

inherit rpm
