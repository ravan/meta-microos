SUMMARY = "A Multiplatform Word Processor - Development files"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "libabiword-3_0-devel-3.0.8-1.5.aarch64.rpm"
RPM_HASH = "b2f02bbdbb889d3fe444d4f0e77be85be0dd4ec45c656fa990cf3cef54f0e04a5632e9bc1690c81c3e3bd7f30c58e0f96b65ef88335cd1f8ba87ba83537569de"

RPROVIDES:${PN} += "abiword-devel \
libabiword-3-0-devel \
pkgconfig-abiword-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
enchant-devel \
fribidi-devel \
glib2-devel \
goffice-devel \
gtk3-devel \
libabiword-3-0 \
libgsf-devel \
librsvg-devel \
pango-devel \
pkgconfig-cairo-fc \
pkgconfig-cairo-pdf \
pkgconfig-cairo-ps \
pkgconfig-enchant \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk+-unix-print-3.0 \
pkgconfig-libgoffice-0.10 \
pkgconfig-libgsf-1 \
pkgconfig-librsvg-2.0 \
pkgconfig-libxslt \
pkgconfig-pangocairo \
pkgconfig-wv-1.0 \
pkgconfig-x11 \
wv-devel"

inherit rpm
