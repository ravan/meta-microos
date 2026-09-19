SUMMARY = "An extremely fast hardware-accelerated screen recorder"
DESCRIPTION = "This is a screen recorder that has minimal impact on system performance \
by recording your monitor using the GPU only, similar to ShadowPlay on \
windows. This is the fastest screen recording tool for Linux. \
 \
This screen recorder can be used for recording your desktop offline, for \
live streaming and for nvidia ShadowPlay-like instant replay, where only \
the last few minutes are saved."
LICENSE = "GPL-3.0-only"

PV = "20260818"

RPM_NAME = "gpu-screen-recorder-20260818-1.1.aarch64.rpm"
RPM_HASH = "f0de4c89b41892f2cff72c575fc14095e227d02bd9b18c7224374a8aee1aaaf3c9dcc2481d8b2d43d348d19deb5464b56631bdcff3c74c4bde32747e77ccf76c"

RPROVIDES:${PN} += "gpu-screen-recorder"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXfixes.so.3 \
libXrandr.so.2 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libdrm.so.2 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libswresample.so.6 \
libva-drm.so.2 \
libva.so.2 \
libwayland-client.so.0 \
libwayland-egl.so.1"

inherit rpm
