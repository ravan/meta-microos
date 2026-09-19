SUMMARY = "Plasma applet written in QML for managing network connections"
DESCRIPTION = "Plasma applet for controlling network connections on systems \
that use the NetworkManager service."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "af5b11faf7d0763e7001cfd357d29893f55da11500c91b642aa486a519ebd319985ed6dd167164af696223f847be79e4356a52ecd01dddfc6306443da7f1da4d"

RPROVIDES:${PN} += "NetworkManager-client \
libplasmanm-cellular.so \
libplasmanm-cellularplugin.so \
libplasmanm-editor.so \
libplasmanm-internal.so \
libplasmanm-internalplugin.so \
plasma-nm-kf5 \
plasma-nm5 \
plasma6-nm \
qt6qmlimport-org.kde.plasma.networkmanagement \
qt6qmlimport-org.kde.plasma.networkmanagement.254 \
qt6qmlimport-org.kde.plasma.networkmanagement.6 \
qt6qmlimport-org.kde.plasma.networkmanagement.cellular \
qt6qmlimport-org.kde.plasma.networkmanagement.cellular.254 \
qt6qmlimport-org.kde.plasma.networkmanagement.cellular.6"

RDEPENDS:${PN} += "NetworkManager \
kf6-kded \
kf6-kirigami-imports \
kf6-networkmanager-qt-imports \
kf6-prison-imports \
kwalletd6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6ModemManagerQt.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libPlasma.so.7 \
libQCoro6DBus.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libqt6keychain.so.1 \
libqt6keychain1 \
libstdc++.so.6 \
qrca \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kirigamiaddons.formcard.1 \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.quickcharts \
qt6qmlimport-org.kde.quickcharts.controls \
systemsettings6"

inherit rpm
