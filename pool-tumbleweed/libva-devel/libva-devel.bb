SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
 \
 \
This package provides the development environment for libva packages."
LICENSE = "MIT"

PV = "2.24.1"

RPM_NAME = "libva-devel-2.24.1-1.1.aarch64.rpm"
RPM_HASH = "ed2cefeb62d55102e884927faf4abd5ab407b120340e36b711f9fd8ff20e041e926e92e545b70a337aab9bb17065dbb8e5b24406a5af2175ef78501744bb77e1"

RPROVIDES:${PN} += "libva-devel \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-libva-wayland \
pkgconfig-libva-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libva-drm2 \
libva-wayland2 \
libva-x11-2 \
libva2 \
pkgconfig-libdrm \
pkgconfig-libva \
pkgconfig-wayland-client \
pkgconfig-x11 \
pkgconfig-xfixes"

inherit rpm
