SUMMARY = "Development files for Weston plugins"
DESCRIPTION = "Weston is the reference implementation of a Wayland compositor, and a \
useful compositor in its own right. Weston has various backends that \
lets it run on Linux kernel modesetting and evdev input as well as \
under X11. \
 \
This package contains all necessary include files and libraries needed \
to develop plugins for Weston."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "16.0.0"

RPM_NAME = "weston-devel-16.0.0-1.1.aarch64.rpm"
RPM_HASH = "199aed44f1d74d76991c4c8a25e4872bea1d3fea087661875087c53fac51085489cc49aca6eb631d42295855c0edc9360c3dbfd45731e5629a6780201c630e77"

RPROVIDES:${PN} += "pkgconfig-libweston-16 \
pkgconfig-libweston-16-protocols \
pkgconfig-weston \
weston-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libweston-16-0 \
pkgconfig-libweston-16 \
pkgconfig-pixman-1 \
pkgconfig-wayland-server \
pkgconfig-xkbcommon"

inherit rpm
