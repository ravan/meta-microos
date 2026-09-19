SUMMARY = "Clock application for Plasma"
DESCRIPTION = "A clock application for Plasma."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kclock-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c510ced4986bbc3e7deead245d98ebb9e80708fd942b2e60fa338b40d0cb180bbf441333923d104fbda84431a64564d1a52a5647ffd2a6ed20a89d5182454757"

RPROVIDES:${PN} += "kclock"

RDEPENDS:${PN} += "kf6-kcoreaddons-imports \
kf6-kirigami-imports \
kf6-ksvg-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6Svg.so.6 \
libKF6WindowSystem.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
qt6-declarative-imports \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.plasmoid"

inherit rpm
