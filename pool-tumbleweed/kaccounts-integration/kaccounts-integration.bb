SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "Small system to administer web accounts for the sites and services across the \
Plasma desktop, including: Google, Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kaccounts-integration-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "57313efd5ede76b057a536742f679df1c9cf2a51c8d1944a43bae4bf8b6f1b4a809351ba7e553abd049b2702bc685c271ed8086a792200415e7fa8d00a5514f0"

RPROVIDES:${PN} += "kaccounts-integration \
libkaccountsdeclarativeplugin.so \
qt6qmlimport-org.kde.kaccounts \
qt6qmlimport-org.kde.kaccounts.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOCore.so.6 \
libKF6Wallet.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libaccounts-qt6.so.1 \
libc.so.6 \
libkaccounts6.so.2 \
libstdc++.so.6 \
signon-kwallet-extension"

inherit rpm
