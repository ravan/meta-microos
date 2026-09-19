SUMMARY = "QML imports for kosmindoormap"
DESCRIPTION = "QML components for KOpeningHours."
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kosmindoormap-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e26af7fcd3aa36b2d3239987ff8b932903763b06dad84e2377b9ac3b3d0e0b44eefdc0f583636f032ce48478cf82ef2a6cea54822be9ac66257c28bd1a0da147"

RPROVIDES:${PN} += "kosmindoormap-imports \
libkosmeditorcontrollerplugin.so \
libkosmindoormap-kpublictransport-integration-plugin.so \
libkosmindoormapquickplugin.so \
libkosmindoorroutingquickplugin.so \
qt6qmlimport-org.kde.kosmindoormap \
qt6qmlimport-org.kde.kosmindoormap.1 \
qt6qmlimport-org.kde.kosmindoormap.kpublictransport \
qt6qmlimport-org.kde.kosmindoormap.kpublictransport.254 \
qt6qmlimport-org.kde.kosmindoormap.kpublictransport.6 \
qt6qmlimport-org.kde.kosmindoorrouting \
qt6qmlimport-org.kde.kosmindoorrouting.254 \
qt6qmlimport-org.kde.osm.editorcontroller \
qt6qmlimport-org.kde.osm.editorcontroller.1 \
qt6qmlimport-org.kde.osm.editorcontroller.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libKOSM.so.1 \
libKOSM1 \
libKOSMIndoorMap.so.1 \
libKOSMIndoorRouting.so.1 \
libKOSMIndoorRouting1 \
libKPublicTransport.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-org.kde.contacts \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigamiaddons.components \
qt6qmlimport-org.kde.kopeninghours \
qt6qmlimport-org.kde.kpublictransport \
qt6qmlimport-org.kde.kpublictransport.ui"

inherit rpm
