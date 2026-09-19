SUMMARY = "Development environment for cairo"
DESCRIPTION = "This package contains all files necessary to build binaries using \
cairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.4"

RPM_NAME = "cairo-devel-1.18.4-4.5.aarch64.rpm"
RPM_HASH = "1a0c09b123420fe4745240f7bd86e963e7c94b2356ca7fb2a7fb1489b9ca724e327afdb96daf0f0ba721ce87e11126d7f6abaf7d12a5c5fdb3c3a4d8a4ddea15"

RPROVIDES:${PN} += "cairo-devel \
cairo-doc \
pkgconfig-cairo \
pkgconfig-cairo-fc \
pkgconfig-cairo-ft \
pkgconfig-cairo-gobject \
pkgconfig-cairo-pdf \
pkgconfig-cairo-png \
pkgconfig-cairo-ps \
pkgconfig-cairo-script \
pkgconfig-cairo-script-interpreter \
pkgconfig-cairo-svg \
pkgconfig-cairo-tee \
pkgconfig-cairo-xcb \
pkgconfig-cairo-xcb-shm \
pkgconfig-cairo-xlib \
pkgconfig-cairo-xlib-xrender"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairo-gobject2 \
libcairo-script-interpreter2 \
libcairo2 \
pkgconfig-cairo \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libpng \
pkgconfig-lzo2 \
pkgconfig-pixman-1 \
pkgconfig-x11 \
pkgconfig-xcb \
pkgconfig-xcb-render \
pkgconfig-xcb-shm \
pkgconfig-xext \
pkgconfig-xrender \
pkgconfig-zlib"

inherit rpm
