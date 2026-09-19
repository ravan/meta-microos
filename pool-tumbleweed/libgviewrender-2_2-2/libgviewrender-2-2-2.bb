SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libgviewrender-2_2-2-2.2.2-1.7.aarch64.rpm"
RPM_HASH = "c4db07120643499bce02dd00cf9d93d8c0e49692db3ba3c3968c6f3391f7f048c0657b83759b997b21a62a18dd382210671bfb940c00fe036de1bd3e3ae0ec14"

RPROVIDES:${PN} += "libgviewrender-2-2-2 \
libgviewrender.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6"

inherit rpm
