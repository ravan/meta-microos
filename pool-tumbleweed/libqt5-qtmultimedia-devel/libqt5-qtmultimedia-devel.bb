SUMMARY = "Development files for the Qt5 Multimedia library"
DESCRIPTION = "You need this package if you want to compile programs with qtmultimedia."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtmultimedia-devel-5.15.19+kde2-1.2.aarch64.rpm"
RPM_HASH = "de6b70f8c6d24c651963ce88361e7f40574caa96b471136dc4a061764e1f644cef2468cade32f38b01c2993b0f32e813706327adf8fbd22fa69342e080402ca8"

RPROVIDES:${PN} += "cmake-Qt5Multimedia \
cmake-Qt5MultimediaGstTools \
cmake-Qt5MultimediaQuick \
cmake-Qt5MultimediaWidgets \
libQt5Multimedia-devel \
libqt5-qtmultimedia-devel \
pkgconfig-Qt5Multimedia \
pkgconfig-Qt5MultimediaWidgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Multimedia5 \
libpulse-devel \
libqt5-qtdeclarative-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Multimedia \
pkgconfig-Qt5Network \
pkgconfig-Qt5Widgets"

inherit rpm
