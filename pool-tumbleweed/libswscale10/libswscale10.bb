SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "libswscale10-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "9ef40fd72bfd7ddb33c55ef0abaf08be223b298c55628e9b8ba3d678416ad2704dcbe48e3ebf321f157eef8e3e21c46dcee15a27ca6783a61a758fda9f65a6a3"

RPROVIDES:${PN} += "libswscale.so.10 \
libswscale10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.61 \
libavutil61 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
