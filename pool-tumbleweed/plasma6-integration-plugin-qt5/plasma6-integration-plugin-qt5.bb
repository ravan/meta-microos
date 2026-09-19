SUMMARY = "Plugins responsible for better integration of Qt 5 applications in KDE Workspace"
DESCRIPTION = "plasma6-integration-plugin, but for Qt 5 applications."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-integration-plugin-qt5-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0f857fe7ad4ea8f9e71a8bf578ec1ea27d3ce9047e2cb67366ed881437de023928fa040447bae8cc7d99eb4aaf85a76fb892f96673de067f299c69caffea4ddf"

RPROVIDES:${PN} += "plasma6-integration-plugin-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libXcursor.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1 \
plasma6-integration-plugin"

inherit rpm
