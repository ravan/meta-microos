SUMMARY = "QML support for MIME tree parser"
DESCRIPTION = " \
mimetreeparser is a parser for MIME trees. Given a MIME tree, it extracts \
the parts (text, html...) and attachments. This package provides QML \
support, allowing to use the library with QtQuick applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "mimetreeparser-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0a0bfe10a9635b70e6264ec6d32f41b1cb353422427cec42f7072aa71b3b7a044218689c3d6b766bb7d2057ecb67bd376c315e56aece53480deb61741242b558"

RPROVIDES:${PN} += "libmimetreeparser-plugin.so \
mimetreeparser-imports \
qt6qmlimport-org.kde.pim.mimetreeparser \
qt6qmlimport-org.kde.pim.mimetreeparser.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6KIOGui.so.6 \
libKF6Mime.so.6 \
libKF6Service.so.6 \
libKPim6MimeTreeParserCore.so.6 \
libKPim6MimeTreeParserCore6 \
libKPim6MimeTreeParserWidgets6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtWebEngine \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigamiaddons.components \
qt6qmlimport-org.kde.kirigamiaddons.formcard"

inherit rpm
