SUMMARY = "Bomberman-like game"
DESCRIPTION = "In this game, the player walks through an arena, lays bombs and, in \
that way, is to kill enemies. Granatier is a clone of the popular \
Bomberman game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "granatier-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9d3a68f1946e5edd06120edf56cb9dfe6f1a9b707dea58d8e51fcf7a98106b75a111887f3725df003c9525777effd950f80aa9d6a0f6fe659fe46f2a88b2ff25"

RPROVIDES:${PN} += "granatier \
granatier5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
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
libc.so.6 \
libstdc++.so.6"

inherit rpm
