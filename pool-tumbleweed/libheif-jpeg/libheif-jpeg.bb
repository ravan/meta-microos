SUMMARY = "Plugin encoder and decoder for JPEG in HEIF"
DESCRIPTION = "This plugin provides the encoder and decoder for JPEG in HEIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-jpeg-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "283c484d71fdbd20884d90eb6f06e8be59e114007b09036a3bcff2c682190b8ecf86e8259eb648beaed38604b6d955488c5e7df20caca74b6d5a1773567ac4af"

RPROVIDES:${PN} += "libheif-jpeg \
libheif-jpegdec.so \
libheif-jpegenc.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
libheif1 \
libjpeg.so.8 \
libstdc++.so.6"

inherit rpm
