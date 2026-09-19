SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 6 workspace."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-workspace-libs-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "7a59ff6ee0a241c52882b6e986f2ad4e1e7bc5be46051b0539dbc6bbb9a1889dbfcfe914c5ae828f1b24fb55f8a08f85b0b1f92e4470466d30b75f6f552a336f"

RPROVIDES:${PN} += "libbatterycontrol.so.6 \
libklipper.so.6 \
libklookandfeel.so.6 \
libkmpris.so.6 \
libkrdb.so \
libkworkspace6.so.6 \
libnotificationmanager.so.1 \
libtaskmanager.so.6 \
plasma5-workspace-libs \
plasma6-workspace-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKWaylandClient.so.6 \
libPlasma.so.7 \
libPlasmaActivities.so.7 \
libPlasmaQuick.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sql.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXau.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libc.so.6 \
libcanberra.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-cursor.so.0 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb.so.1 \
plasma6-framework"

inherit rpm
