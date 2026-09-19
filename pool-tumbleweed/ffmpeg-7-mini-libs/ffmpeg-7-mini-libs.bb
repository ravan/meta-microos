SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-mini-libs-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "441419ae5556be8bc77437e9a6993139b59343c8050981f5c40994131f9beb626adbccdbe4af424d01cc3777cb6b94bb8c91a257e9fdb73c18c2731080cd3f31"

RPROVIDES:${PN} += "ffmpeg-7-mini-libs \
libavcodec.so.61 \
libavdevice.so.61 \
libavfilter.so.10 \
libavformat.so.61 \
libavutil.so.59 \
libpostproc.so.58 \
libswresample.so.5 \
libswscale.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
this-is-only-for-build-envs"

inherit rpm
