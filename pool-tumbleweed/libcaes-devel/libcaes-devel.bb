SUMMARY = "Development files for libcaes, a AES encryption library"
DESCRIPTION = "libcaes is a library for AES encryption. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcaes."
LICENSE = "LGPL-3.0-or-later"

PV = "20260905"

RPM_NAME = "libcaes-devel-20260905-1.1.aarch64.rpm"
RPM_HASH = "7f0f4dc4e8816530149f8022c95ee97bb8841b0013df337e6e70651c342fc0b8fecec0c2151cf5890eba1d75ed333d351ff45983780b0321197cc5201354450a"

RPROVIDES:${PN} += "libcaes-devel \
pkgconfig-libcaes"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcaes1"

inherit rpm
