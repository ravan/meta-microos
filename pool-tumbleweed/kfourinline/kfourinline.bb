SUMMARY = "Four Wins game"
DESCRIPTION = "Four wins is a two-player board game where you have to align four \
(gravity-affected) pieces of the same colour to win."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kfourinline-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d0ff9c2386ce829e76d4262e2e752f2c1811060ee32b2272af072085d607149f8295de5cb2cfbfe1fdc2aecb0198c060f79de7fb68d197071656690d727581f1"

RPROVIDES:${PN} += "kfourinline \
kfourinline5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKDEGames6Private.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
