SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libswscale5_9-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "1ef78aa42ec80e866e5a33d731eb445d46945af960dc8d6fcf831dc52a3baf4ae0f450fd3033802b4ac918cb66cc155b6b1304787d01714231ea3370d2c9b79b"

RPROVIDES:${PN} += "libswscale.so.5.9 \
libswscale5-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6"

inherit rpm
