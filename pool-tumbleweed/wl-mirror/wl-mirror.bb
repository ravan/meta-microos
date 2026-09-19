SUMMARY = "A Wayland output mirror client"
DESCRIPTION = "A Wayland output mirror client. \
It mirrors (in the sense of copying, not swapping left↔right) an \
output onto a new resizable window."
LICENSE = "GPL-3.0-or-later"

PV = "0.18.5"

RPM_NAME = "wl-mirror-0.18.5-1.5.aarch64.rpm"
RPM_HASH = "661db1790da4ded4d890176cc11a3f13c84f43200bcb96eabd986bee1f06f635ebeb6dac0c3c0b4ac82313ff7f5219d9894e5066415df3505cdff721b69f6965"

RPROVIDES:${PN} += "wl-mirror"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdecor-0.so.0 \
libwayland-client.so.0 \
libwayland-egl.so.1"

inherit rpm
