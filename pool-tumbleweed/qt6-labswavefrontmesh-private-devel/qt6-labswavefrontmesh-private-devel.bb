SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "50d94f5ee1ab0f81f5285a75ef09df89bbd3c6ba0c334142581c54ab924245e3a0e06fe9b537403cac560911f39b44c850e5fa3ef2a526f4eb0c8b5c4f001bfa"

RPROVIDES:${PN} += "cmake-Qt6LabsWavefrontMesh \
cmake-Qt6LabsWavefrontMeshPrivate \
pkgconfig-Qt6LabsWavefrontMesh \
qt6-labswavefrontmesh-devel \
qt6-labswavefrontmesh-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QuickPrivate \
libQt6LabsWavefrontMesh6"

inherit rpm
