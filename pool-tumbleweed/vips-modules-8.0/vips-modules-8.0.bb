SUMMARY = "Additional modules for libvips"
DESCRIPTION = "Additional modules for libvips."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "vips-modules-8.0-8.18.5-1.3.aarch64.rpm"
RPM_HASH = "2531310925ceddeadff7bf033feddf9b4ba3c45ee3b1d840889d6d918324c1aa15f804e963b59ce2fc360a57b24180e7c990431c8f356fe283b27c962f30b68b"

RPROVIDES:${PN} += "vips-modules-8.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libopenslide.so.1 \
libpoppler-glib.so.8 \
libvips.so.42 \
libvips42"

inherit rpm
