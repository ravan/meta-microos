SUMMARY = "Examples for the qt6-3d modules"
DESCRIPTION = "Examples for the qt6-3d modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3d-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "747663aea063a4a54fe8279d3747492bc22585fed3c5a85d025924ff2ab16db3365a431e2e242bd50ec1f8e0e5e68ac9235cde2f9811d3145bc40c07075bec67"

RPROVIDES:${PN} += "qt6-3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DQuick.so.6 \
libQt63DQuickExtras.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-Qt3D.Core.2 \
qt6qmlimport-Qt3D.Extras.2 \
qt6qmlimport-Qt3D.Input.2 \
qt6qmlimport-Qt3D.Render.2 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Scene3D.2"

inherit rpm
