SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knotifications-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f7b9995b16121fa1488dc92e41f2fdf44adf75d936b9fc9546c9762bf0418b92bfc1d08801429390775a435b35fa06522d2f6267da875e798f9b496a3287cf46"

RPROVIDES:${PN} += "kf6-knotifications-imports \
libknotificationqmlplugin.so \
qt6qmlimport-org.kde.notification \
qt6qmlimport-org.kde.notification.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
