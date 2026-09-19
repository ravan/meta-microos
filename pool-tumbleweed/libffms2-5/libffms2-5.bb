SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "5.0+0"

RPM_NAME = "libffms2-5-5.0+0-1.14.aarch64.rpm"
RPM_HASH = "cadb8835d9530c2342cb9744495c6599576b02774c4e6ee8617913be8ad7eeea50569c45d7256690b3385de852e715e157ce1b3ade37e40fe264ce41ba97b53a"

RPROVIDES:${PN} += "libffms2-5 \
libffms2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libz.so.1"

inherit rpm
