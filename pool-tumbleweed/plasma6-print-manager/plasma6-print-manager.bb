SUMMARY = "Tools for managing print jobs and printers"
DESCRIPTION = "plasma6-print-manager provides tools for managing print jobs and printers."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-print-manager-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "87e53d73d48735396bb23076b6200ace9a71a0e49ef9e7373458800294b2e5a253fa01b745145e83687dc4e28837c1af5000c1b8d88bc40a9e54734ce221fb29"

RPROVIDES:${PN} += "dbus-com.redhat.NewPrinterNotification \
kde-print-manager \
libkcups.so \
libkcupsplugin.so \
plasma6-print-manager \
print-manager5 \
qt6qmlimport-org.kde.plasma.printmanager \
qt6qmlimport-org.kde.plasma.printmanager.254 \
qt6qmlimport-org.kde.plasma.printmanager.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKirigamiApp.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcups.so.2 \
libstdc++.so.6 \
system-config-printer-dbus-service"

inherit rpm
