SUMMARY = "GTK devel files for libfm"
DESCRIPTION = "GTK libfm libraries for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm-gtk3-devel-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "5fd6924aa78d05fbc200f9e30a2ed42365aa43853ece25f6320acd116a3a31a8e9dfbf87a373e6babe8d600bc2692017e7f1f3a79b1389c8952b7fdd314c9b67"

RPROVIDES:${PN} += "libfm-gtk3-devel \
pkgconfig-libfm-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk3-devel \
libfm \
libfm-gtk3-4 \
libfm4 \
pkgconfig \
pkgconfig-gio-unix-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libfm"

inherit rpm
