SUMMARY = "Development files for libv4l"
DESCRIPTION = "The libv4l-devel package contains libraries and header files for \
developing applications that use libv4l."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "libv4l-devel-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "57c6a445c30ea95500274fbf013c07d7d27718c12d1ca9f8b4ee4ae360b61f9953860284d11b44ddd7022fafa7b65ef048cb71f8d8d558ad12b68688f8e31628"

RPROVIDES:${PN} += "libv4l-devel \
pkgconfig-libv4l1 \
pkgconfig-libv4l2 \
pkgconfig-libv4l2rds \
pkgconfig-libv4lconvert"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libv4l1-0 \
libv4l2-0 \
libv4l2rds0 \
libv4lconvert0 \
pkgconfig-libjpeg \
pkgconfig-libv4l2 \
pkgconfig-libv4lconvert"

inherit rpm
