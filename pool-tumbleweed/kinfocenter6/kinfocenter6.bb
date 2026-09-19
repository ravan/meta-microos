SUMMARY = "Utility that provides information about a computer system"
DESCRIPTION = "KDE Utility that provides information about a computer system."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kinfocenter6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "236a6c67808dd66d677e37316f8a0a10fd1afaafaccd8589d82951b9247931db388c0cad5dcb67b3d67c627ec61069ffb4b08b22d9cea518bcc65410afecb07a"

RPROVIDES:${PN} += "kinfocenter5 \
kinfocenter6 \
libKInfoCenterInternal.so \
libKInfoCenterInternalplugin.so \
qt6qmlimport-org.kde.kinfocenter.private \
qt6qmlimport-org.kde.kinfocenter.private.1"

RDEPENDS:${PN} += "/usr/bin/glxinfo \
/usr/bin/wayland-info \
/usr/bin/xdpyinfo \
kf6-baloo-imports \
kf6-kcmutils-imports \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdrm.so.2 \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0 \
pciutils \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.ki18n \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kquickcontrolsaddons.2 \
systemsettings6"

inherit rpm
