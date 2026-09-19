SUMMARY = "Qt6 Quick3DAssetImport library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dassetimport-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5cb076ccfed0d01de0d6b9ac3120a52601e26dee1b8083aea32472be370b0fbc1dc31d6a7358ab37e1fd91749ae51a480cff39b2e4a697ed62b6d67eb9c1b7cd"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DAssetImport \
qt6-quick3dassetimport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick3DUtils \
libQt6Quick3DAssetImport6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick3DUtils"

inherit rpm
