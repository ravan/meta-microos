SUMMARY = "Breakout-like game by KDE"
DESCRIPTION = "KBreakout is the KDE version of a Breakout-like game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kbreakout-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6faa4e2763f16651e46d5a3e76d6ed0d8239294f6a67cc5fc149fd5592e282439df5b4fd457d7f19a3447ae39c0ff0270052167ab7836352bf2dd75c10a69e20"

RPROVIDES:${PN} += "kbreakout \
kbreakout5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-org.kde.games.core.0"

inherit rpm
