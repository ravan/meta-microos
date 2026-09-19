SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libswscale8-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "5f2bc6174eff8bf79ed74ba7b935367220bd89abe708e6d418eac4a65039d0f2ade5128f7bfe9a1f529c01ad2bdc2da1b69e8bf7675c2351f09474e3c49834e8"

RPROVIDES:${PN} += "libswscale.so.8 \
libswscale8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.59 \
libavutil59 \
libc.so.6 \
libm.so.6"

inherit rpm
