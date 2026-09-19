SUMMARY = "Plasma 6 core libraries"
DESCRIPTION = "This package contains the core libraries needed by the Plasma framework."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libPlasma7-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "ad46a90d273348f93e8b44f43eb5220ffea75dd849e9808db55da0d820f8d469662918410f7c5faf9b72e3a3959eb0e347d3de713b5e6022034b6cfd57498b1b"

RPROVIDES:${PN} += "libPlasma.so.7 \
libPlasma6 \
libPlasma7 \
libPlasmaQuick.so.7 \
qt6qmlimport-org.kde.plasma.configuration \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.plasmoid \
qt6qmlimport-org.kde.plasma.plasmoid.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigQml.so.6 \
libKF6CoreAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Svg.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libplasma6-components \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1"

inherit rpm
