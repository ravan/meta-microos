SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "5.0+0"

RPM_NAME = "ffmsindex-5.0+0-1.14.aarch64.rpm"
RPM_HASH = "3fa4e37f128693d8b496d406689ed9a50912b5aed893c81378fe47ad9b747c3dd525941849b3af2f0a560f7a5a2c3d1e7254b2d8917a06dcd025c2a102778888"

RPROVIDES:${PN} += "ffmsindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavutil.so.60 \
libc.so.6 \
libffms2.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
