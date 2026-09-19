SUMMARY = "A library which provides the glue between Coin and Qt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "libSoQt20-1.6.3-1.8.aarch64.rpm"
RPM_HASH = "90aed8b758f9518c05a635ee1671d17c166233cf43c14616cdbf1f849f677207559d4df47dca560350ba77da7aaf71d72d82badba75cc4a6026dd266717da83d"

RPROVIDES:${PN} += "libSoQt.so.20 \
libSoQt20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
