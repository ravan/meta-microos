SUMMARY = "A VNC server library"
DESCRIPTION = "A VNC server library."
LICENSE = "ISC"

PV = "1.0.1"

RPM_NAME = "libneatvnc1-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "cc05d7f1ab713acab8618b39992c5fedba4eea923de5b86854e549350b4a6ed2d83e0460b88eab26e4e0c20e6bce64db7b8425df57f40e6fde69566eb5304a23"

RPROVIDES:${PN} += "libneatvnc.so.1 \
libneatvnc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaml.so.1 \
libavcodec.so.62 \
libavfilter.so.11 \
libavutil.so.60 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libnettle.so.8 \
libpixman-1.so.0 \
libturbojpeg.so.0 \
libz.so.1"

inherit rpm
