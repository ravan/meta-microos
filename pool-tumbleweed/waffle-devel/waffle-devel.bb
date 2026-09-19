SUMMARY = "Libraries, includes and more to develop Waffle applications"
DESCRIPTION = "Devel files for the waffle C library. Libraries, includes and more to \
develop Waffle applications."
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "waffle-devel-1.8.1-2.3.aarch64.rpm"
RPM_HASH = "01718e8d635caefb0e8374efab85a0e8c747ddbe655bd4f5a1629e7bb0f954898cb8330c2d52e988a7e7b0d6e97a305b463342d8a37ec92ab5a26244ad0432dc"

RPROVIDES:${PN} += "pkgconfig-waffle-1 \
waffle-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwaffle-1-0 \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-gl \
pkgconfig-libdrm \
pkgconfig-wayland-client \
pkgconfig-wayland-egl \
pkgconfig-x11-xcb"

inherit rpm
