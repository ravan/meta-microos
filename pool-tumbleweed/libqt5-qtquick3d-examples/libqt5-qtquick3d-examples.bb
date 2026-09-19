SUMMARY = "Qt5 Quick 3D examples"
DESCRIPTION = "Examples for the Qt Quick 3D module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtquick3d-examples-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "77a72637889c15fad61e2c9037698497c9fee10fa0afd7e8bb9e91c5486dd1b9350ec8ffbe81d75d61f7d3a2c54933d38fb7c0d3c37b0d7676ebe804ada4cbb2"

RPROVIDES:${PN} += "libqt5-qtquick3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick3D.so.5 \
libc.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtQuick3D.1 \
qt5qmlimport-QtQuick3D.Effects.1 \
qt5qmlimport-QtQuick3D.Helpers.1 \
qt5qmlimport-QtQuick3D.Materials.1"

inherit rpm
