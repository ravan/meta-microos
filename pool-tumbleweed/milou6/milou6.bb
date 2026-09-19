SUMMARY = "Dedicated search application built on top of Baloo"
DESCRIPTION = "A dedicated search application built on top of Baloo"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "milou6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "cde70af98bc87d41a823cc7dbc2d493a5cb6c0e4b2cbd5cc44e46d5a52db9a053e7f5fe574ad5d39cd86046abe7ef23488de25c1b87c13ae5e2ecf1c6346ba8b"

RPROVIDES:${PN} += "libmilou.so \
milou5 \
milou6 \
qt6qmlimport-org.kde.milou \
qt6qmlimport-org.kde.milou.254 \
qt6qmlimport-org.kde.milou.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Runner.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.ksvg.1 \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.extras.2"

inherit rpm
