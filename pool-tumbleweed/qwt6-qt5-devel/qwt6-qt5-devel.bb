SUMMARY = "Include headers and Qt Designer plugin for Qwt(Qt5)"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt(Qt5) widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "qwt6-qt5-devel-6.3.0-1.9.aarch64.rpm"
RPM_HASH = "3b3ca601add06131894a956dd2c2d61951f2c1bc2bb88e7b916d42aa23f1a361a602ca5a1e31a2fb9653b0806ca8b193ebf46fed74f9ac038a1c7deef02aa26e"

RPROVIDES:${PN} += "pkgconfig-Qt5Qwt6 \
qwt-qt5-devel \
qwt6-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freetype2-devel \
gcc-c++ \
libqwt6-qt5-6-3 \
pkgconfig-Qt5Concurrent \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Svg \
pkgconfig-Qt5Widgets \
pkgconfig-libpng"

inherit rpm
