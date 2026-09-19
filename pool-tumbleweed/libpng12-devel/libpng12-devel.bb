SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng12-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng12. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-devel-1.2.59-6.2.aarch64.rpm"
RPM_HASH = "481d95c52685b7f02a49fbe2b1d49814b6825740348f703f520e517581c9077d3f065ba6b3d0db8d307a2d89c2a406e248cf748b5eff254116afa05a3465c0d3"

RPROVIDES:${PN} += "libpng12-devel \
pkgconfig-libpng12"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpng12-0 \
pkg-config \
zlib-devel"

inherit rpm
