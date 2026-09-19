SUMMARY = "Update notifier for KDE Software Manager"
DESCRIPTION = "This is a notifier for Discover to inform the user that updates are available and allows the \
user to install them using Discover."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "discover6-notifier-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "145ef2b36182fd7c32228749dce34029b4bf9621f8761ac800b4620d42f2231f2054a1b09cc6d2427aea286b6beeddcb546e818761a5861eca8cb43d81db8ce3"

RPROVIDES:${PN} += "discover-notifier \
discover6-notifier"

RDEPENDS:${PN} += "discover6 \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.3 \
libDiscoverNotifiers.so \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekitqt6.so.2 \
libstdc++.so.6"

inherit rpm
