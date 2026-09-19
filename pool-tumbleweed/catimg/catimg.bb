SUMMARY = "Insanely fast image printing in your terminal"
DESCRIPTION = "catimg is a little program written in C with no dependencies that prints images in terminal. It supports JPEG, PNG and GIF formats. This program was originally a script that did the same by using ImageMagick convert."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "catimg-2.8.0-1.5.aarch64.rpm"
RPM_HASH = "a3caa099cdb32fa66b405a76f1e2544683b22bdc2c354961576c873ef9ce21366130f7f966ecbd575f32bdd4840b13dbb0db436e754b87e068ba01a425302e0a"

RPROVIDES:${PN} += "catimg"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
