SUMMARY = "SVG-based theme engine for Qt5 and Qt6"
DESCRIPTION = "Kvantum is an SVG-based theme engine for Qt, tuned to Plasma and LXQt, with an emphasis on elegance, usability and practicality. \
Its homepage is https://github.com/tsujan/Kvantum. \
 \
Kvantum also comes with extra themes that can be selected and activated by using Kvantum Manager. \
 \
This package provides Kvantum theme engine for Qt5."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "kvantum-qt5-1.1.8-1.2.aarch64.rpm"
RPM_HASH = "2f801933d19eda0b13109f839188e17e5a4df966806b39527fb8256d06e288e7e6a8bb9cadfb60bf28df8457473a7a5983a660c2554ca4d15a6c101c5795cb40"

RPROVIDES:${PN} += "kvantum-qt5 \
libkvantum.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
