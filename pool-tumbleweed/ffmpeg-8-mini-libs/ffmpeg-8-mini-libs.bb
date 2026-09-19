SUMMARY = "Feature/Dependency-reduced build of FFmpeg"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages. \
Their testsuites may be unable to complete if they expect a particular \
feature."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-mini-libs-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "e9dcc01453b95e9a465984769a1b355069b5594e6d76183da40a186cdcd53a3a33dcd52eba76da7c37f84ab28908382497e74e9b3ebb22d87c5cb33ece845653"

RPROVIDES:${PN} += "ffmpeg-8-mini-libs \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libswresample.so.6 \
libswscale.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
this-is-only-for-build-envs"

inherit rpm
