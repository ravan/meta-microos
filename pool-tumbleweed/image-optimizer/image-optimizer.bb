SUMMARY = "Simple lossless image compression"
DESCRIPTION = "Compress your images with ease using JpegOptim and OptiPng."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "image-optimizer-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "b40d9a6baf194fabf4a18551181c46af9018f82071da108169f4e57d92fab899d0871c24bb135f6f58e4b510087b1f08aa7071881ce115048d5a44ed004fbe83"

RPROVIDES:${PN} += "image-optimizer"

RDEPENDS:${PN} += "jpegoptim \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
optipng"

inherit rpm
