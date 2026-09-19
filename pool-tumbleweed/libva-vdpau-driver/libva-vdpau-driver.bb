SUMMARY = "HW video decode support for VDPAU platforms"
DESCRIPTION = "VDPAU Backend for Video Acceleration (VA) API HW video decode support."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "libva-vdpau-driver-0.7.4-8.9.aarch64.rpm"
RPM_HASH = "bbb15d522c4b19f465c06e9b7e3e399659389e2b2eef8c7ef18fb3e2f7d121d32c71fca5c3d05dc73972ba63aa0b9ec586d50381338d6c125ad785b8d534a8e8"

RPROVIDES:${PN} += "config-libva-vdpau-driver \
libva-vdpau-driver \
vdpau-video"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libvdpau.so.1"

inherit rpm
