SUMMARY = "Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
QML imports."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-activities-imports-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "898d26a912289c9827e3ed8884b2fede831f8d2015f130f465e744551594cb94f0817259aa0aa03c8f8952f1c1ae4da2a64a05fbfa4b2836d6d615a7e09904c6"

RPROVIDES:${PN} += "libplasmaactivitiesextensionplugin.so \
plasma6-activities-imports \
qt6qmlimport-org.kde.activities \
qt6qmlimport-org.kde.activities.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
