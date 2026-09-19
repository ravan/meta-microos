SUMMARY = "SDL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "SDL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_sdl0_1_5-0.1.5-1.28.aarch64.rpm"
RPM_HASH = "8d7fe64e0f33c2d03f08826c7351883515c3afadfa64783904128300ae6f0c12c66027e99c5256f70ab734f26176493675891f686bd616c4c05ffe7615530238"

RPROVIDES:${PN} += "libfifechan-sdl.so.0.1.5 \
libfifechan-sdl0-1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libfifechan.so.0.1.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
