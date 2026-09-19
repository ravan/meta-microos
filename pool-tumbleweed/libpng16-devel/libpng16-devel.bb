SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng16. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "libpng-2.0"

PV = "1.6.58"

RPM_NAME = "libpng16-devel-1.6.58-2.1.aarch64.rpm"
RPM_HASH = "a828a09568630bb47a83cbaf92902f669ec5c8bc61049f6b0efc9b42c5b740511830493c94eea0a1ba11356fbb8ef7c2a01299103466f77f84f72702955bc258"

RPROVIDES:${PN} += "libpng16-devel \
pkgconfig-libpng16"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpng16-16 \
pkgconfig \
pkgconfig-zlib"

inherit rpm
