SUMMARY = "Reversi board game"
DESCRIPTION = "KReversi is a board game game where two players have to gain the \
majority of pieces on the board. This is done by tactically placing \
ones pieces to turn over the opponents pieces."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kreversi-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e04d8de8d72f1e15b8a6c1f70e46fea4ce8e7fbc46197f3d0f64240e4fe4408202e2e1d83e8212d67bb4c7f2969e6d0d7d4739d1fc3cdbbba97641d3fedb5396"

RPROVIDES:${PN} += "kreversi \
kreversi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-org.kde.games.core.0"

inherit rpm
