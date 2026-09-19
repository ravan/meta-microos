SUMMARY = "DRM shared library part of faad2"
DESCRIPTION = "FAAD2 is a HE, LC, MAIN and LTP profile, MPEG2 and MPEG-4 AAC decoder. \
FAAD2 includes code for SBR (HE AAC) decoding. \
The shared library part of faad2-drm"
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "libfaad_drm2-2.11.3-1.1.aarch64.rpm"
RPM_HASH = "cbd3de37a6d159b76b06272af8521f4faf13c6c4bf17e1e57e798ba662b78311e64562c78a6b7cbe06524ad2a9d1bde2b32073be1527e8c5204eb6213ba97a88"

RPROVIDES:${PN} += "libfaad-drm.so.2 \
libfaad-drm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
