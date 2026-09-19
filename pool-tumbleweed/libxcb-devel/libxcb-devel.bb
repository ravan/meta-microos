SUMMARY = "Development files for the X11 protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This package contains the development headers for the library found \
in libxcb1."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-devel-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "e9c917cb5613550b466bbfb227dc73e73ab36e0b5e574457e93e65f3a442482f3d6e9aa35e809db9500b0773224a3d58ab02ffb5eb5393705f72b023b4596184"

RPROVIDES:${PN} += "libxcb-devel \
pkgconfig-xcb \
pkgconfig-xcb-composite \
pkgconfig-xcb-damage \
pkgconfig-xcb-dbe \
pkgconfig-xcb-dpms \
pkgconfig-xcb-dri2 \
pkgconfig-xcb-dri3 \
pkgconfig-xcb-glx \
pkgconfig-xcb-present \
pkgconfig-xcb-randr \
pkgconfig-xcb-record \
pkgconfig-xcb-render \
pkgconfig-xcb-res \
pkgconfig-xcb-screensaver \
pkgconfig-xcb-shape \
pkgconfig-xcb-shm \
pkgconfig-xcb-sync \
pkgconfig-xcb-xf86dri \
pkgconfig-xcb-xfixes \
pkgconfig-xcb-xinerama \
pkgconfig-xcb-xinput \
pkgconfig-xcb-xkb \
pkgconfig-xcb-xtest \
pkgconfig-xcb-xv \
pkgconfig-xcb-xvmc \
xorg-x11-libxcb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-composite0 \
libxcb-damage0 \
libxcb-dbe0 \
libxcb-dpms0 \
libxcb-dri2-0 \
libxcb-dri3-0 \
libxcb-glx0 \
libxcb-present0 \
libxcb-randr0 \
libxcb-record0 \
libxcb-render0 \
libxcb-res0 \
libxcb-screensaver0 \
libxcb-shape0 \
libxcb-shm0 \
libxcb-sync1 \
libxcb-xf86dri0 \
libxcb-xfixes0 \
libxcb-xinerama0 \
libxcb-xinput0 \
libxcb-xkb1 \
libxcb-xtest0 \
libxcb-xv0 \
libxcb-xvmc0 \
pkgconfig-xau \
pkgconfig-xcb \
pkgconfig-xcb-dri3 \
pkgconfig-xcb-randr \
pkgconfig-xcb-render \
pkgconfig-xcb-shape \
pkgconfig-xcb-shm \
pkgconfig-xcb-sync \
pkgconfig-xcb-xfixes \
pkgconfig-xcb-xv"

inherit rpm
