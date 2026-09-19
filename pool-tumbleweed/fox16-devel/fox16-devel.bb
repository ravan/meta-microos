SUMMARY = "Development Files and Documentation for the FOX GUI Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The devel package contains the files necessary to develop applications \
using the FOX GUI toolkit: the header files, the reswrap resource \
compiler, and manual pages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-1.6.57-4.14.aarch64.rpm"
RPM_HASH = "ea757b2f382d1a1915e4fcb9f00819241f3c5cca2bce80255a8c276be7c8a1c288282435f15531920fc962f9c5729e86301d3603a143f799fdb39aff19bc4d56"

RPROVIDES:${PN} += "fox-devel \
fox16-devel \
pkgconfig-fox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
bzip2 \
cups-devel \
cups-libs \
expat \
glibc-devel \
libFOX-1-6-0 \
libbz2-devel \
libc.so.6 \
libexpat-devel \
libjpeg-devel \
libpng-devel \
libtiff-devel \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-x11 \
pkgconfig-xcursor \
pkgconfig-xext \
pkgconfig-xft \
pkgconfig-xi \
pkgconfig-xproto \
pkgconfig-xrandr \
pkgconfig-xrender \
zlib-devel"

inherit rpm
