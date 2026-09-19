SUMMARY = "Feature/dependency-reduced build of FFmpeg"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages. \
Their testsuites may be unable to complete if they expect a particular \
feature."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-mini-libs-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "8090e8835b5fcb6f92c67e9acd2709371b09cdc17a7abc13fd1192b4c13d51043ae3fd592a78dc09fe97e1e9d5711bd05b4655a1670895a682dd652588c84c17"

RPROVIDES:${PN} += "ffmpeg-9-mini-libs \
libavcodec.so.63 \
libavdevice.so.63 \
libavfilter.so.12 \
libavformat.so.63 \
libavutil.so.61 \
libswresample.so.7 \
libswscale.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
this-is-only-for-build-envs"

inherit rpm
