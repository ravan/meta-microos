SUMMARY = "Utility program for screen recording of wlroots-based compositors"
DESCRIPTION = "Utility program for screen recording of wlroots-based compositors \
(more specifically, those that support wlr-screencopy-v1 and xdg-output)."
LICENSE = "MIT"

PV = "0.6.0+git4"

RPM_NAME = "wf-recorder-0.6.0+git4-1.5.aarch64.rpm"
RPM_HASH = "716813f9f24170ee22a57fd559669930a2395c1002bb20d68af1dc11d4cccb162c34402ddb01ada48c846bb9ddd0dcb190f21c8ec1a03bc40e538f1deda83d5d"

RPROVIDES:${PN} += "wf-recorder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.6 \
libwayland-client.so.0"

inherit rpm
