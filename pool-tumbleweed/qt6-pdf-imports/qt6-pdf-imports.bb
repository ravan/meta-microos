SUMMARY = "Qt 6 Pdf QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Pdf module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdf-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "84f3bf01e52e4a1a15c89a9803d0c982f2be5cb83a4e65d6880d8504d6ca5c522a3a0a0f34a1b3d613d93f2cece5a632deea96598f9b70d0491bf475a7360ded"

RPROVIDES:${PN} += "libpdfquickplugin.so \
qt6-pdf-imports \
qt6qmlimport-QtQuick.Pdf \
qt6qmlimport-QtQuick.Pdf.2 \
qt6qmlimport-QtQuick.Pdf.5 \
qt6qmlimport-QtQuick.Pdf.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6PdfQuick.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Material \
qt6qmlimport-QtQuick.Controls.Universal \
qt6qmlimport-QtQuick.Shapes"

inherit rpm
