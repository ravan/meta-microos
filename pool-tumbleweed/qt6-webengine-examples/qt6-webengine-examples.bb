SUMMARY = "Examples for the qt6-webengine modules"
DESCRIPTION = "Examples for the qt6-webengine modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webengine-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fec3cffe6ec2aa1eb83f1f45e3597b954936e9dc20fddcb184d238a44d4505983df8fbc3763d64fb93a778cec9e17e2942619674e2688319d9d1a988ff2b6cc3"

RPROVIDES:${PN} += "qt6-webengine-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Pdf.so.6 \
libQt6PdfWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Fusion \
qt6qmlimport-QtQuick.Controls.Material \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Pdf \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtWebEngine"

inherit rpm
