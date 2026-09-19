SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libpostproc55_9-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "1e76c880b1f57ffbda28eb08880789bf8669283dc43d42240f0b24f95fa8b5c78a49e0b383b2399f5f110383d62815d10b17f340c2067805be2ce9cf17693380"

RPROVIDES:${PN} += "libpostproc.so.55.9 \
libpostproc55-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6"

inherit rpm
