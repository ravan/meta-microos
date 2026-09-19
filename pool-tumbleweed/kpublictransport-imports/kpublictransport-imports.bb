SUMMARY = "QML Imports for using kpublictransport"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries. QML imports."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpublictransport-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "57b5c5066f5f01076d4793d8e77c11e7868de0a8c2bb40c77e8bb1c2e9dcaada96a646f4a73585bb1aaaedcc766fbdb88cd3a8d8ca73d2bd4ae221ba40fe5e67"

RPROVIDES:${PN} += "kpublictransport-imports \
libkpublictransportonboardqmlplugin.so \
libkpublictransportqmlplugin.so \
libkpublictransportquickplugin.so \
qt6qmlimport-org.kde.kpublictransport \
qt6qmlimport-org.kde.kpublictransport.1 \
qt6qmlimport-org.kde.kpublictransport.onboard \
qt6qmlimport-org.kde.kpublictransport.onboard.1 \
qt6qmlimport-org.kde.kpublictransport.ui \
qt6qmlimport-org.kde.kpublictransport.ui.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPublicTransport.so.1 \
libKPublicTransportOnboard.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtLocation \
qt6qmlimport-QtNetwork \
qt6qmlimport-QtPositioning \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.i18n.localeData \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.delegates \
qt6qmlimport-org.kde.kirigamiaddons.delegates \
qt6qmlimport-org.kde.kirigamiaddons.formcard \
qt6qmlimport-org.kde.kitemmodels"

inherit rpm
