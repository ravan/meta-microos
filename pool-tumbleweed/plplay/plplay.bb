SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "7.360.1"

RPM_NAME = "plplay-7.360.1-1.5.aarch64.rpm"
RPM_HASH = "ed76dcf1fe5e3b1902de4ab7617698f7b035130b321513286fcb26057ee78204a42d06feab8072d25fb450c93fb9fa7d95e06d39e7747337f2a144b8f0175ec6"

RPROVIDES:${PN} += "plplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libglfw.so.3 \
libm.so.6 \
libplacebo.so.360"

inherit rpm
