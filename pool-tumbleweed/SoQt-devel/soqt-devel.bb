SUMMARY = "Development files for SoQt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "SoQt-devel-1.6.3-1.8.aarch64.rpm"
RPM_HASH = "c015d3619080ef5ae74a8ea758d4b950169282a62cc6aa5b86fc4b5afcfdbef7861425061ee05e16e6b2f3a351c933700ba402df45017c03fbe3da45513bea99"

RPROVIDES:${PN} += "SoQt-devel \
cmake-soqt \
pkgconfig-SoQt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Gui \
cmake-Qt5OpenGL \
cmake-Qt5Widgets \
cmake-coin \
libSoQt20 \
libpng-devel \
pkgconfig-Coin \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5Widgets"

inherit rpm
