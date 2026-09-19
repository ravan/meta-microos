SUMMARY = "Network Neighborhood Browser and Samba Share Mounting Utility"
DESCRIPTION = "Smb4K is an advanced network neighborhood browser and Samba share mounting \
utility for the KDE Software Compilation. It scans your network neighborhood \
for all available workgroups, servers and shares and can mount all desired \
shares to your local file system."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "smb4k-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "3ba8129b9563b8382ba05716d843b94d770c5b0459ca044aae47e7fffbb85ec1829e643afdbbb45eabcf51e222fd3fe51d38dacb7b4fd050e04e052143f15852"

RPROVIDES:${PN} += "libsmb4kcore.so \
libsmb4kdialogs.so \
libsmb4kqmlplugin.so \
qt6qmlimport-org.kde.smb4k.smb4kqmlplugin \
qt6qmlimport-org.kde.smb4k.smb4kqmlplugin.2 \
smb4k"

RDEPENDS:${PN} += "/sbin/ldconfig \
cifs-utils \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKDSoapWSDiscoveryClient.so.0 \
libKF6AuthCore.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Solid.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdsoap-qt6.so.2 \
libplasma6-components \
libqt6keychain.so.1 \
libsmbclient.so.0 \
libstdc++.so.6 \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.plasmoid \
samba-client"

inherit rpm
