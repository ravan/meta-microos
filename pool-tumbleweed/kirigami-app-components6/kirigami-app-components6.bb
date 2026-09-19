SUMMARY = "Kirigami addons and modules"
DESCRIPTION = "Kirigami addons and modules necessary to do a full featured KDE application, \
such as integration with configurable keyboard shortcuts and standard actions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "kirigami-app-components6-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "9bd716772090fdb8421bf99c20c01cea484129f1e04acede63c0539f43d39053899506cad3d3e56bf754ebb564d9bcefa629dc12dbb66025733b51b707b2cc05"

RPROVIDES:${PN} += "kirigami-app-components6 \
libKirigamiActionCollectionplugin.so \
qt6qmlimport-org.kde.kirigami.actioncollection \
qt6qmlimport-org.kde.kirigami.actioncollection.1"

RDEPENDS:${PN} += "libKirigamiActionCollection.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.ki18n \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kitemmodels"

inherit rpm
