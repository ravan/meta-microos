SUMMARY = "Qt Development Kit"
DESCRIPTION = "QML API for Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtquick3d-imports-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "55061dd2b7e86f7fc13890656a8c2354a30c43308f416a3f28fefc13b0cbecc87db12bb5a9b80911938c22448b7d3aa858a3a74cba2ada64a11846f80ee6e60b"

RPROVIDES:${PN} += "libqquick3dplugin.so \
libqt5-qtquick3d-imports \
libqtquick3deffectplugin.so \
libqtquick3dhelpersplugin.so \
libqtquick3dmaterialplugin.so \
qt5qmlimport-QtQuick3D.1 \
qt5qmlimport-QtQuick3D.Effects.1 \
qt5qmlimport-QtQuick3D.Helpers.1 \
qt5qmlimport-QtQuick3D.Materials.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Quick3D.so.5 \
libQt5Quick3D5 \
libQt5Quick3DAssetImport5 \
libc.so.6 \
libqt5-qtquick3d-tools \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtQuick3D.1 \
qt5qmlimport-QtQuick3D.Effects.1 \
qt5qmlimport-QtQuick3D.Materials.1"

inherit rpm
