SUMMARY = "Development files for birb"
DESCRIPTION = "Development files for birb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "birb-devel-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "be29be1f52ea915fd73bbca05d69f759af9c43f07ac79861442b860fffc207b3a984d8cc78150d5e741e35b4785536a3dd326719d8b7c6c070926d80ee891ce6"

RPROVIDES:${PN} += "birb-devel \
pkgconfig-birb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
birb \
libbirb0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-pango \
typelib-1-0-Birb-1-0"

inherit rpm
