SUMMARY = "Small utility to dump info about DRM devices"
DESCRIPTION = "Small utility to dump info about DRM devices."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "drm_info-2.10.0-1.3.aarch64.rpm"
RPM_HASH = "922b7c59a596a8855055a58775199ef6e80c0b20239380eccc4162e5df67f91d745307562841cd58224fbc851e0c3905aab4353cf7d0c86e1be262c49c289327"

RPROVIDES:${PN} += "drm-info"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libjson-c.so.5 \
libpci.so.3"

inherit rpm
