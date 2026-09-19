SUMMARY = "Library for Rendering PostScript Documents"
DESCRIPTION = "libspectre is a small library for rendering Postscript documents. It \
provides a convenient easy to use API for handling and rendering \
Postscript documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "libspectre-devel-0.2.12-2.17.aarch64.rpm"
RPM_HASH = "fd3dcd4127a4ad493881b45b041182a410140306b7005911753d4e43ab5bba342c305b9596642c9482230daa27e284c9a1fb51b27e0c364f67b535be397475e3"

RPROVIDES:${PN} += "libspectre-devel \
pkgconfig-libspectre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript-devel \
libspectre1"

inherit rpm
