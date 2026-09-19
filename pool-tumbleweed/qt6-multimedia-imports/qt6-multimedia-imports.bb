SUMMARY = "Qt 6 Multimedia QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Multimedia module."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2eb1319f0233a33ea0b6d1f3a7c4e59902f3215178f66ae68416e274a7e070bc9859e79322ebefd19bc0ab045a78592ecb8975dc21ac7d0efd4dbad7c0b528b1"

RPROVIDES:${PN} += "libquick3dspatialaudioplugin.so \
libquickmultimediaplugin.so \
qt6-multimedia-imports \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtMultimedia.2 \
qt6qmlimport-QtMultimedia.5 \
qt6qmlimport-QtMultimedia.6 \
qt6qmlimport-QtQuick3D.SpatialAudio \
qt6qmlimport-QtQuick3D.SpatialAudio.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6MultimediaQuick.so.6 \
libQt6Qml.so.6 \
libQt6Quick3DSpatialAudio.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
