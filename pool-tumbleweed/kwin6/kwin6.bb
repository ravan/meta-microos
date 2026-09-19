SUMMARY = "KDE Window Manager"
DESCRIPTION = "KWin is Plasma window manager."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kwin6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "baea7f5e3aca9d858b61eee29a1a0f0838f924b2c8229cb43d0b65d969099faf729f0e2473c4d64f61b97f841631162c0d17ffa3f98ba9aefb3ec7c50d2870a8"

RPROVIDES:${PN} += "kwin5 \
kwin6 \
libeffectsplugin.so \
libkcmkwincommon.so.6 \
libkdecorationprivatedeclarative.so \
qt6qmlimport-org.kde.kwin \
qt6qmlimport-org.kde.kwin.3 \
qt6qmlimport-org.kde.kwin.private.effects \
qt6qmlimport-org.kde.kwin.private.effects.1 \
qt6qmlimport-org.kde.kwin.private.effects.254 \
qt6qmlimport-org.kde.kwin.private.kdecoration \
qt6qmlimport-org.kde.kwin.private.kdecoration.2 \
qt6qmlimport-org.kde.kwin.private.kdecoration.254 \
qt6qmlimport-org.kde.kwin.private.kdecoration.6 \
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
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IdleTime.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Service.so.6 \
libKF6Svg.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKGlobalAccelD.so.0 \
libKNightTime.so.0 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcanberra.so.0 \
libeis.so.1 \
libepoxy.so.0 \
libgcc-s.so.1 \
libkdecorations3.so.6 \
libkdecorations3private.so.2 \
libkwin.so.6 \
libkwin6 \
libm.so.6 \
libpipewire-0.3.so.0 \
libqaccessibilityclient-qt6.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libxcb-composite.so.0 \
libxcb-randr.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
permissions \
plasma6-framework-components \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
xwayland"

inherit rpm
