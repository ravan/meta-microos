SUMMARY = "Lasso development headers and documentation"
DESCRIPTION = "This package contains the header files, static libraries and development \
documentation for Lasso."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "liblasso-devel-2.9.0-1.7.aarch64.rpm"
RPM_HASH = "d03eaf620c408d964e967a0bbcfd7975e6bc5bbcbc8a3ed521550049c95514ebcb4377b259ff942b5bb33cda588bccdcc76f1452bcb5868fa97a1838192a12cc"

RPROVIDES:${PN} += "liblasso-devel \
pkgconfig-lasso"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblasso3 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-xmlsec1"

inherit rpm
