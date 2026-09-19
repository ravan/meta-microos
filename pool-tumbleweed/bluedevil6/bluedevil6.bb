SUMMARY = "Bluetooth Manager for KDE Plasma"
DESCRIPTION = "Bluetooth daemon for KDE Plasma, handling connections."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "bluedevil6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "426f22d5e8f517cb54dee64c147c2d8e1147d3fac1af6e3c887f47154ba50c472b1c3a0e759d3612da14a1e681eb215f1fed7bcc4f2b7d7d4fa9ff3f081d99bc"

RPROVIDES:${PN} += "bluedevil5 \
bluedevil6 \
libbluedevilcomponents.so \
libbluetoothplugin.so \
qt6qmlimport-org.kde.bluedevil.components \
qt6qmlimport-org.kde.bluedevil.components.254 \
qt6qmlimport-org.kde.plasma.private.bluetooth \
qt6qmlimport-org.kde.plasma.private.bluetooth.254 \
qt6qmlimport-org.kde.plasma.private.bluetooth.6"

RDEPENDS:${PN} += "bluez \
kf6-bluez-qt-imports \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6BluezQt.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-org.kde.bluezqt \
qt6qmlimport-org.kde.kirigami"

inherit rpm
