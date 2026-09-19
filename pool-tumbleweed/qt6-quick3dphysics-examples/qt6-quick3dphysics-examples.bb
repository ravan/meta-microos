SUMMARY = "Examples for the qt6-quick3dphysics modules"
DESCRIPTION = "Examples for the qt6-quick3dphysics modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9c8a4aa561c0eb411277c77917c77edbf45fddcb641dc4d51438e9f251f716da2287dc5b7d6ee8118e7e3a2a578452944e18e526a81fc3111295211e2bfd535f"

RPROVIDES:${PN} += "qt6-quick3dphysics-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick3D \
qt6qmlimport-QtQuick3D.Helpers \
qt6qmlimport-QtQuick3D.Particles3D \
qt6qmlimport-QtQuick3D.Physics"

inherit rpm
