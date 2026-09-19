SUMMARY = "Development files for libsixel"
DESCRIPTION = "Development files for libsixel, a C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.5"

RPM_NAME = "libsixel-devel-1.10.5-2.7.aarch64.rpm"
RPM_HASH = "46bc1f9757d330b75891a924219e79ffeee9dce0987e9e4af6262dee5b41b22b21cdbcf22d61158d8208f3c7cb6dd71050fc297877cbeea3992d317959cdf0cc"

RPROVIDES:${PN} += "libsixel-devel \
pkgconfig-libsixel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsixel1 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-libcurl \
pkgconfig-libjpeg \
pkgconfig-libpng"

inherit rpm
