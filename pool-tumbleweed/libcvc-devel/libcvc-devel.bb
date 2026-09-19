SUMMARY = "LibCVC API -- Development Files"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications. \
 \
This package contains development files for libcvc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcvc-devel-6.4.1-1.8.aarch64.rpm"
RPM_HASH = "0568853b19153c14a47a9d0b706943d301a811120143c5bddd9e9cd75a0396e63eca41045e870c3a70a92d3d23269e5dbc46b057da86b7f6f703075feddcb6a4"

RPROVIDES:${PN} += "libcvc-devel \
pkgconfig-cvc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcvc0 \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libpulse \
pkgconfig-libpulse-mainloop-glib \
typelib-1-0-Cvc-1-0"

inherit rpm
