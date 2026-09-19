SUMMARY = "A set of QtQuick components for image editing"
DESCRIPTION = "KQuickImageEditor is a set of QtQuick components providing basic image editing \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0.1"

RPM_NAME = "kquickimageeditor6-imports-0.7.0.1-1.1.aarch64.rpm"
RPM_HASH = "24c484e912f10e8c1619b571d26e095b3e9d3aa14d737986af4b10f243c6cb6db8a7a106c18b34995db6c07f7da8eb91ad2664f2e074b2b24aa22d37bd6da9e6"

RPROVIDES:${PN} += "kquickimageeditor6-imports \
libKQuickImageEditorplugin.so \
qt6qmlimport-org.kde.kquickimageeditor \
qt6qmlimport-org.kde.kquickimageeditor.1"

RDEPENDS:${PN} += "libKQuickImageEditor.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-org.kde.kirigami"

inherit rpm
