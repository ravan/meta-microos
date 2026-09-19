SUMMARY = "Puzzle game"
DESCRIPTION = "Turn the board pieces to get all computers connected."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "knetwalk-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ff60dfc4964545b76d56dab5f68c3255e0e5c43bf050f30dd40e4762127461893359ddbef46c07db2ba4fdf3654c0896f79c5827ad527dc79639973234e4e007"

RPROVIDES:${PN} += "knetwalk \
knetwalk5"

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
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-org.kde.games.core.0"

inherit rpm
