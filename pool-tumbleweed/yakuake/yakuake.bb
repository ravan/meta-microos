SUMMARY = "Drop-down terminal emulator based on Konsole technologies"
DESCRIPTION = "Yakuake is a Drop-down terminal emulator based on Konsole technologies."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "yakuake-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "700c0d63743b8252658e64f5f14d5ce00f360abef55ebaa7ca0cde7f1a1c33e4c0e72b7963770f3acf90e93212201589762d3551cbc9715049ac410b0e5e0acf"

RPROVIDES:${PN} += "yakuake"

RDEPENDS:${PN} += "konsole-part \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Parts.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKWaylandClient.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-randr.so.0 \
libxcb.so.1"

inherit rpm
