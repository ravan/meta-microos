SUMMARY = "KDE Accounts Providers"
DESCRIPTION = "KDE Accounts Providers."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kaccounts-providers-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e61e1dc010dfeb78e61dbe7a5f2d2317e1783a55ff7b3d96a7fe676896078e981fd84e120b3297e0ee4835e3c3eadecccc446e2a3f2dafb2cd5afebe5b2ff537"

RPROVIDES:${PN} += "kaccounts-providers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6Package.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libkaccounts6.so.2 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtWebEngine.1 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kirigami.delegates \
signon-plugin-oauth2"

inherit rpm
