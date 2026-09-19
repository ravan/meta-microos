SUMMARY = "Wayland backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver."
LICENSE = "MIT"

PV = "2.24.1"

RPM_NAME = "libva-wayland2-2.24.1-1.1.aarch64.rpm"
RPM_HASH = "c855f0838f3f50191418c1c56d3ff867945bd22af5d355b75ad167910e434dc7cc379fb15d61c95c8b859ed4d57508975fb3251cccf927874fe1b2d9a0bd9238"

RPROVIDES:${PN} += "libva-wayland.so.2 \
libva-wayland2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
