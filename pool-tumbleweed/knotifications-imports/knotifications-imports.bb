SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knotifications-imports-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "1813fd6b008cdb7d98214f77826f3b3b3e7d1ee6fa7d0a41a6e74d8cb74bd4e7593620ef25650b88c7018f48900730a07d6771a8d4385fbed31d1bb7637ab5c7"

RPROVIDES:${PN} += "knotifications-imports \
libknotificationqmlplugin.so \
qt5qmlimport-org.kde.notification.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
