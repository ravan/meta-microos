SUMMARY = "Header files for the Cairo C++ interface"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cairomm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.1"

RPM_NAME = "cairomm-devel-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "cdccabc60fb9d962483a5b9d6ca869d1f64a000056cf1203c38e263115cdced964d92110be49bd09a4136a0ad4fce94e47f1a9a2b62bbe14ed4a27bc96564058"

RPROVIDES:${PN} += "cairomm-devel \
pkgconfig-cairomm-1.16 \
pkgconfig-cairomm-ft-1.16 \
pkgconfig-cairomm-pdf-1.16 \
pkgconfig-cairomm-png-1.16 \
pkgconfig-cairomm-ps-1.16 \
pkgconfig-cairomm-svg-1.16 \
pkgconfig-cairomm-xlib-1.16 \
pkgconfig-cairomm-xlib-xrender-1.16"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairomm-1-16-1 \
pkgconfig-cairo \
pkgconfig-cairo-ft \
pkgconfig-cairo-pdf \
pkgconfig-cairo-png \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg \
pkgconfig-cairo-xlib \
pkgconfig-cairo-xlib-xrender \
pkgconfig-cairomm-1.16 \
pkgconfig-sigc++-3.0"

inherit rpm
