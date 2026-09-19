SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtquick3d-devel-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "d61a198b6e24774f604a76b223296c0e1584523af5ae48291a31ff5cbed59bcab2a7a215f59565cbb26f38ebe15d659f04677f28baf3536b9e2af74ea63ae3a8"

RPROVIDES:${PN} += "cmake-Qt5Quick3D \
cmake-Qt5Quick3DAssetImport \
cmake-Qt5Quick3DRender \
cmake-Qt5Quick3DRuntimeRender \
cmake-Qt5Quick3DUtils \
libqt5-qtquick3d-devel \
pkgconfig-Qt5Quick3D \
pkgconfig-Qt5Quick3DAssetImport \
pkgconfig-Qt5Quick3DRender \
pkgconfig-Qt5Quick3DRuntimeRender \
pkgconfig-Qt5Quick3DUtils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Quick3D5 \
libQt5Quick3DAssetImport5 \
libqt5-qtquick3d-tools \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick \
pkgconfig-Qt5Quick3DAssetImport \
pkgconfig-Qt5Quick3DRender \
pkgconfig-Qt5Quick3DRuntimeRender \
pkgconfig-Qt5Quick3DUtils"

inherit rpm
