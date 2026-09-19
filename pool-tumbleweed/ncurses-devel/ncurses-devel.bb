SUMMARY = "Development files for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "ncurses-devel-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "70fe4a34d24f67018f3adc4770672421f8e56e728135e5acbcb7c113e36ed66b8a1bc0b03b19247d5c155d0286033b3360127fac099cf5c4b00a0aceb4dd1cf8"

RPROVIDES:${PN} += "ncurses-/usr/include/ncurses.h \
ncurses-devel \
ncurses6-devel \
pkgconfig-form \
pkgconfig-formw \
pkgconfig-menu \
pkgconfig-menuw \
pkgconfig-ncurses \
pkgconfig-ncurses++ \
pkgconfig-ncurses++w \
pkgconfig-ncursesw \
pkgconfig-panel \
pkgconfig-panelw \
pkgconfig-tic \
pkgconfig-ticw \
pkgconfig-tinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/tack \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses-c++6 \
libncurses6 \
libticw.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
