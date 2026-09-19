SUMMARY = "Wacom drivers KCM"
DESCRIPTION = "This module implements a GUI for the Wacom Linux Drivers and extends it \
with profile support to handle different button / pen layouts per profile."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "wacomtablet-kcm6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "5ca4de352b05d9a37f3e5870773d6de2197a805aacb0f7950531f47b9a7fa1acee6ac4e6fa230d704b0fc3aeaa52e76d6c347e2c39054b4a8b9a93743bd96486"

RPROVIDES:${PN} += "kcm-tablet \
wacomtablet-kcm6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libPlasma5Support.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libXi.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwacom.so.9 \
libxcb-xinput.so.0 \
libxcb.so.1 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.config \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.plasma5support \
qt6qmlimport-org.kde.plasma.plasmoid \
systemsettings6"

inherit rpm
