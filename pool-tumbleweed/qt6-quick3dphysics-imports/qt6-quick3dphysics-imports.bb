SUMMARY = "Qt 6 Quick3DPhysics QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3DPhysics module."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "54813ef9178980b0b4643c6c0082939a2fdeab720e3393540c5266db475b0573fbe418e4e2858436b3c858a5b087e9d2213334235b465e7192570777c9fcbb96"

RPROVIDES:${PN} += "libqquick3dphysicsplugin.so \
libqtquick3dphysicshelpersplugin.so \
qt6-quick3dphysics-imports \
qt6qmlimport-QtQuick3D.Physics \
qt6qmlimport-QtQuick3D.Physics.6 \
qt6qmlimport-QtQuick3D.Physics.Helpers \
qt6qmlimport-QtQuick3D.Physics.Helpers.1 \
qt6qmlimport-QtQuick3D.Physics.Helpers.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3DPhysics.so.6 \
libQt6Quick3DPhysicsHelpers.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick3D"

inherit rpm
