SUMMARY = "Themeable window decoration for KWin"
DESCRIPTION = "Aurorae is a themeable window decoration for KWin. \
 \
It supports theme files consisting of several SVG files for decoration and \
buttons. Themes can be installed and selected directly in the configuration \
module of KWin decorations."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "aurorae6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "4b427a59f57da4d84313e99de4e8867c993c1051a420375dbd1100874c795a4c5cca5dc0cc73b75ba2801ef5cde4255259f646f8b140186fceafeace598b9e13"

RPROVIDES:${PN} += "aurorae6 \
libdecorationplugin.so \
libplastikplugin.so \
qt6qmlimport-org.kde.kwin.decoration \
qt6qmlimport-org.kde.kwin.decoration.0 \
qt6qmlimport-org.kde.kwin.decorations.plastik \
qt6qmlimport-org.kde.kwin.decorations.plastik.1"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6Package.so.6 \
libKF6Svg.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdecorations3.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.ksvg.1"

inherit rpm
