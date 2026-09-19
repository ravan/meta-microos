SUMMARY = "Nonogram Logic game"
DESCRIPTION = "A nonogram logic game by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "picmi-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "77429f92ba190a8a8efaed30875f14bb937b979d8f6e4db788dbddd630efb2aebb94fb52f416e7835971b9fe67aebebc9960d27ec314fc54ebdcaa26a8d15083"

RPROVIDES:${PN} += "picmi \
picmi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
