SUMMARY = "QML imports for using kidentitymanagement"
DESCRIPTION = "QML imports for using kidentitymanagement."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kidentitymanagement-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8d7f2162bf5e07ad7d2cb35e5bfc8a080469f85644e564992027022d3c322a5444b81c3be2b5ac012e5792b4ec1301a323f9eaada325c8bbcfc1e47bb5a07176"

RPROVIDES:${PN} += "kidentitymanagement-imports \
libkidentitymanagement-quick-plugin.so \
qt6qmlimport-org.kde.kidentitymanagement \
qt6qmlimport-org.kde.kidentitymanagement.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementCore6 \
libKPim6IdentityManagementQuick.so.6 \
libKPim6IdentityManagementQuick6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kidentitymanagement.1 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kirigamiaddons.formcard.1"

inherit rpm
