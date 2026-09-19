SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libPlasmaActivitiesStats1-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "18d71d609399fefd6b5d8f05dfe0194cc1efd4bfcad25f9801d85af85aa2d1bd370f3e2b93b2ada37aa181d0ba3ea2909cd2db82fcfa6292cc36e0f4219a0642"

RPROVIDES:${PN} += "libPlasmaActivitiesStats.so.1 \
libPlasmaActivitiesStats1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6 \
plasma6-activities-stats \
qt6-sql-sqlite"

inherit rpm
