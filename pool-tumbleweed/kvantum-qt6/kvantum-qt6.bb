SUMMARY = "SVG-based theme engine for Qt5 and Qt6"
DESCRIPTION = "Kvantum is an SVG-based theme engine for Qt, tuned to Plasma and LXQt, with an emphasis on elegance, usability and practicality. \
Its homepage is https://github.com/tsujan/Kvantum. \
 \
Kvantum also comes with extra themes that can be selected and activated by using Kvantum Manager. \
 \
This package provides Kvantum theme engine for Qt6."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "kvantum-qt6-1.1.8-1.2.aarch64.rpm"
RPM_HASH = "10b1749a8ea81755a1a76086ea37a961e0ef53ba0f3f53b93596e859dff4dbc8de33d77db040577ef56ccc5d87508dac249d0b3198a9982593bcf5f17c0ac8d1"

RPROVIDES:${PN} += "kvantum-qt6 \
libkvantum.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
