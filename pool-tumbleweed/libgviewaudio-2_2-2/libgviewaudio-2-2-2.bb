SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libgviewaudio-2_2-2-2.2.2-1.7.aarch64.rpm"
RPM_HASH = "9e253214706ccf7209c1c40b0f0cfb8594d5e997e3834e61d1e779c4de8dbd546b325ff607952a231900648b9c83ad22831d6c1f778b96f769dcc602d5c3aedb"

RPROVIDES:${PN} += "libgviewaudio-2-2-2 \
libgviewaudio.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libportaudio.so.2 \
libpulse.so.0"

inherit rpm
