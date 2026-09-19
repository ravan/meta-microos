SUMMARY = "Opensource JPEG 2000 Codec Implementation"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG). \
 \
This package provides the codec executables."
LICENSE = "BSD-2-Clause"

PV = "2.5.4"

RPM_NAME = "openjpeg2-2.5.4-2.6.aarch64.rpm"
RPM_HASH = "3f38b04360d39a8c0b14b4e073822ae3177e79544273aae7b63f28008e9d70ea9dbb1d689f4e97161b75a35902df56aa9cf45b5aa39319940cf7789f0b85e719"

RPROVIDES:${PN} += "openjpeg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblcms2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
