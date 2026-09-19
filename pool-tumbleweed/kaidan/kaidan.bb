SUMMARY = "A XMPP client based on KDE Framework"
DESCRIPTION = "Kaidan is a simple Jabber/XMPP client providing a user-interface using \
Kirigami and QtQuick. The back-end of Kaidan is entirely written in C++ \
using the qxmpp XMPP client library and Qt 6."
LICENSE = "AML & GPL-3.0-or-later & SUSE-GPL-3.0+-with-openssl-exception & MIT & CC-BY-SA-4.0"

PV = "0.16.0"

RPM_NAME = "kaidan-0.16.0-1.2.aarch64.rpm"
RPM_HASH = "8bca3dc3d89967b16cd78bcffbbe5bf14cfe1d92dd1afc37267cfa94ab51f2e0cebd7877ae287214e75c44298265f573fd26152308211c002b6bfad890ec9749"

RPROVIDES:${PN} += "kaidan"

RDEPENDS:${PN} += "gstreamer-plugins-good-qtqml6 \
kf6-kirigami-imports \
kf6-prison-imports \
kirigami-addons6 \
kquickimageeditor6-imports \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Prison.so.6 \
libKF6WindowSystem.so.6 \
libQXmppOmemoQt6.so.10 \
libQXmppQt6.so.10 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libicuuc.so.78 \
libkdsingleapplication-qt6.so.1.2 \
libqt6keychain.so.1 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-location \
qt6-multimedia-imports \
qt6-positioning-imports \
qt6-sql-sqlite"

inherit rpm
