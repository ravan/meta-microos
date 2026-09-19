SUMMARY = "Plugins responsible for better integration of Qt 6 applications in KDE Workspace"
DESCRIPTION = "Plasma Integration is a set of plugins responsible for better integration of Qt \
applications when running on a KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-integration-plugin-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "6fe235684e83f9bff66fe26393df8aa9023da1787ed06dbdbc18ae27b92b09e16973bbddf7873259d308563735058f6eb0162fcc88ebdea1094cb1c1f2811cd0"

RPROVIDES:${PN} += "plasma5-integration-plugin \
plasma6-integration-plugin"

RDEPENDS:${PN} += "hack-fonts \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libXcursor.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1 \
noto-sans \
qqc2-breeze-style6 \
xdg-desktop-portal-kde6"

inherit rpm
