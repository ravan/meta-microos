SUMMARY = "QT/KF6 backend for xdg-desktop-portal"
DESCRIPTION = "A Qt/KF backend implementation for xdg-desktop-portal"
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "xdg-desktop-portal-kde6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "8e2da30c4cf1458a29f6c0671e3a5cf513f12c6a17db485047a645cc532d90953d18d603cc417c7f1ccdb7f579d315179d54edb71228e970ffed18c5ab7389ba"

RPROVIDES:${PN} += "xdg-desktop-portal-kde \
xdg-desktop-portal-kde6"

RDEPENDS:${PN} += "/usr/bin/sh \
kf6-kiconthemes-imports \
kpipewire6-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WindowSystem.so.6 \
libKWaylandClient.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
plasma6-workspace \
xdg-desktop-portal"

inherit rpm
