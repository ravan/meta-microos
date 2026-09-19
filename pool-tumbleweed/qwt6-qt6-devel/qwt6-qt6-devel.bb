SUMMARY = "Include headers and Qt Designer plugin for Qwt(Qt5)"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt(Qt6) widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "qwt6-qt6-devel-6.3.0-1.10.aarch64.rpm"
RPM_HASH = "d0f908e04cee75ab6784cf689430af5bb9d740b64a4a93a1bfc53263d8e422ac862a48687f46618129e1ececb7cc942367061ef7e8a3ed54079ec2ca9b861dd5"

RPROVIDES:${PN} += "pkgconfig-Qt6Qwt6 \
qwt6-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freetype2-devel \
gcc-c++ \
libqwt6-qt6-6-3 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6PrintSupport \
pkgconfig-Qt6Svg \
pkgconfig-Qt6Widgets \
pkgconfig-libpng"

inherit rpm
