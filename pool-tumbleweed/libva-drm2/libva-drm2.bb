SUMMARY = "DRM backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/DRM runtime library."
LICENSE = "MIT"

PV = "2.24.1"

RPM_NAME = "libva-drm2-2.24.1-1.1.aarch64.rpm"
RPM_HASH = "e80a263da52298ca502ffbdfe6b0a2821a6e79118b3f8e760077b7d7b71e12b62b0e02f3e8b31bde5e66c6fc7ff48a586a166345ab60456aa218dd3b64d18270"

RPROVIDES:${PN} += "libva-drm.so.2 \
libva-drm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2"

inherit rpm
