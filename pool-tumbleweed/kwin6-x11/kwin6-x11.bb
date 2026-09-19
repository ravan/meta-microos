SUMMARY = "KDE Window Manager"
DESCRIPTION = "KWin is Plasma window manager."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kwin6-x11-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "e1ebc21a01dcf93c499ed85e45d8a55aa7f33a9e0ed5d1022eb41f20fb602ebedcf4e99f89b64fc90ebc505ed8032d9043a862494561bc6c81e507a0d94009f6"

RPROVIDES:${PN} += "kwin5 \
kwin6-x11 \
libeffectsplugin.so \
libkcmkwincommon-x11.so.6 \
libkdecorationprivatedeclarative.so \
qt6qmlimport-org.kde.kwin-x11 \
qt6qmlimport-org.kde.kwin-x11.3 \
qt6qmlimport-org.kde.kwin-x11.private.effects \
qt6qmlimport-org.kde.kwin-x11.private.effects.1 \
qt6qmlimport-org.kde.kwin-x11.private.effects.254 \
qt6qmlimport-org.kde.kwin-x11.private.kdecoration \
qt6qmlimport-org.kde.kwin-x11.private.kdecoration.2 \
qt6qmlimport-org.kde.kwin-x11.private.kdecoration.254 \
qt6qmlimport-org.kde.kwin-x11.private.kdecoration.6 \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
breeze6-decoration \
kdialog \
kf6-kdeclarative-imports \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
kglobalacceld6 \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Package.so.6 \
libKF6Service.so.6 \
libKF6Svg.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKNightTime.so.0 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6UiTools.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libcanberra.so.0 \
libepoxy.so.0 \
libkdecorations3.so.6 \
libkdecorations3private.so.2 \
libkwin-x11-6 \
libkwin-x11.so.6 \
libm.so.6 \
libqaccessibilityclient-qt6.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-composite.so.0 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-xfixes.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
plasma6-framework-components \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.ksvg.1 \
qt6qmlimport-org.kde.kwin \
qt6qmlimport-org.kde.kwin.3 \
qt6qmlimport-org.kde.plasma.components.3 \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.quickcharts \
qt6qmlimport-org.kde.quickcharts.controls \
xwayland"

inherit rpm
