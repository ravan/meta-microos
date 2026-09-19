SUMMARY = "Header files for the Cairo C++ interface"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cairomm1_0."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.6"

RPM_NAME = "cairomm1_0-devel-1.14.6-1.1.aarch64.rpm"
RPM_HASH = "1e9ef78856ab87d1b67de5274408dae09cf143a89753dfd877fb9758e0cf7c43368b868cd5282c14759e82ca9ecb8f89778ae613b984f22ea26151bd6ae9d1f3"

RPROVIDES:${PN} += "cairomm1-0-devel \
pkgconfig-cairomm-1.0 \
pkgconfig-cairomm-ft-1.0 \
pkgconfig-cairomm-pdf-1.0 \
pkgconfig-cairomm-png-1.0 \
pkgconfig-cairomm-ps-1.0 \
pkgconfig-cairomm-svg-1.0 \
pkgconfig-cairomm-xlib-1.0 \
pkgconfig-cairomm-xlib-xrender-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairomm-1-0-1 \
pkgconfig-cairo \
pkgconfig-cairo-ft \
pkgconfig-cairo-pdf \
pkgconfig-cairo-png \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg \
pkgconfig-cairo-xlib \
pkgconfig-cairo-xlib-xrender \
pkgconfig-cairomm-1.0 \
pkgconfig-sigc++-2.0"

inherit rpm
