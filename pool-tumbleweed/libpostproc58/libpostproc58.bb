SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libpostproc58-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "f302a1b878f8cea2c80f84d1c7371127786b250bb067f36c4193c2b67a2345e496ce72c1647e2020fec666079f56e2e0f898da987e14153c664c8dcd31e39dd7"

RPROVIDES:${PN} += "libpostproc.so.58 \
libpostproc58"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.59 \
libavutil59 \
libc.so.6"

inherit rpm
