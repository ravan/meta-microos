SUMMARY = "Helper for the KDE Plasma Browser Integration"
DESCRIPTION = "This package contains a helper binary necessary for the WebExtension to \
work."
LICENSE = "GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-browser-integration-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "46315db5e1af326dbbe6562858694115299ce20e2a87691736b8678d2f4dbb484d9978b346782209ca64f95ab46cb2f97557c8191f16681e3bee096814c024a2"

RPROVIDES:${PN} += "plasma-browser-integration \
plasma6-browser-integration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
libtaskmanager.so.6"

inherit rpm
