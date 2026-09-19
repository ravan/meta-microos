SUMMARY = "QML imports for the KDE Holidays Franework"
DESCRIPTION = "QML imports for the KDE Holidays Franework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kholidays-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5a6c50524c15735298fa2d0d0fed8ada740eeaad0bd3d3e80a2daa9078744a1847d3362ad19ddfb9c2dd72235437e9c5afa118e80fdfb918448fe388c4fa4254"

RPROVIDES:${PN} += "kf6-kholidays-imports \
libkholidaysdeclarativeplugin.so \
qt6qmlimport-org.kde.kholidays \
qt6qmlimport-org.kde.kholidays.1 \
qt6qmlimport-org.kde.kholidays.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Holidays.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
