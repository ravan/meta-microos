SUMMARY = "A Qt Quick Controls 2 Style for Desktop UIs"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-qqc2-desktop-style-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0c9a285556aa182eb8b0da2bb9b6b6cdb1c97a0e6726a1051228e18f46502c526581d473a9cc275c4b0a45aa12e24dc2c332fc4ce1eff2f4449acd71872b2aa0"

RPROVIDES:${PN} += "kf6-qqc2-desktop-style \
liborg-kde-desktop-private.so \
liborg-kde-desktop.so \
libqqc2desktopstyleplugin.so \
qt6qmlimport-org.kde.desktop \
qt6qmlimport-org.kde.desktop.1 \
qt6qmlimport-org.kde.desktop.private \
qt6qmlimport-org.kde.desktop.private.1 \
qt6qmlimport-org.kde.qqc2desktopstyle.private \
qt6qmlimport-org.kde.qqc2desktopstyle.private.2 \
qt6qmlimport-org.kde.qqc2desktopstyle.private.254 \
qt6qmlimport-org.kde.qqc2desktopstyle.private.6"

RDEPENDS:${PN} += "kf6-sonnet-imports \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6IconThemes.so.6 \
libKirigamiPlatform.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.dialogs \
qt6qmlimport-org.kde.kirigami.platform \
qt6qmlimport-org.kde.sonnet"

inherit rpm
