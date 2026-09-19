SUMMARY = "KDE Power Management module"
DESCRIPTION = "KDE Power Management module. Provides kded daemon, DBus helper and KCM for \
configuring Power settings."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "powerdevil6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b888faab3edff8074b1bbfa671c6d60fd9c668b66b200c7a8b3d6992cafb4eebdb59700b3b25ce6a6a69cd75e321937dd4e09ea71c5e5f46038b60b9f648ef43"

RPROVIDES:${PN} += "libbatterymonitorplugin.so \
libbrightnesscontrolplugin.so \
libpowerdevilcore.so.2 \
powerdevil5 \
powerdevil6 \
qt6qmlimport-org.kde.plasma.private.batterymonitor \
qt6qmlimport-org.kde.plasma.private.batterymonitor.254 \
qt6qmlimport-org.kde.plasma.private.brightnesscontrolplugin \
qt6qmlimport-org.kde.plasma.private.brightnesscontrolplugin.254"

RDEPENDS:${PN} += "/usr/bin/sh \
kf6-kidletime-plugins \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Runner.so.6 \
libKF6Screen.so.8 \
libKF6ScreenDpms.so.8 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6XmlGui.so.6 \
libKirigamiPlatform.so.6 \
libPlasma.so.7 \
libPlasmaActivities.so.7 \
libQCoro6DBus.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libddcutil.so.5 \
libkworkspace6.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
libxcb.so.1 \
plasma6-workspace-libs \
qt6qmlimport-org.kde.notification \
systemd"

inherit rpm
