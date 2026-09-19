SUMMARY = "Qt6 Quick3DParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dparticles-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b4ba2d98d9732f5141692d7f2da4fff3bda34fa7b321d932d847733c93128ca94d7555c0e48fe5618f07b2dc860a53ad40e172e867e692ebd1070ee60273fb46"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticles \
pkgconfig-Qt6Quick3DParticles \
qt6-quick3dparticles-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DParticles6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
pkgconfig-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
