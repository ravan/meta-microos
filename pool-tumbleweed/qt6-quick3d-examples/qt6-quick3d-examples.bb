SUMMARY = "Examples for the qt6-quick3d modules"
DESCRIPTION = "Examples for the qt6-quick3d modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3d-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2b322ef6731c13d844c8349729e092f68868fb2248b3c8266c4acd64778e1dec3d93435ae985aae6b6f869b8de15e36f8470ab3e5c53f171336075ecc7199857"

RPROVIDES:${PN} += "qt6-quick3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-QtCore \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Universal \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Particles \
qt6qmlimport-QtQuick.Timeline \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtQuick3D \
qt6qmlimport-QtQuick3D.AssetUtils \
qt6qmlimport-QtQuick3D.Effects \
qt6qmlimport-QtQuick3D.Helpers \
qt6qmlimport-QtQuick3D.Particles3D \
qt6qmlimport-QtQuick3D.Xr"

inherit rpm
