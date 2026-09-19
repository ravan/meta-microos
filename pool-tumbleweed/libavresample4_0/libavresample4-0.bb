SUMMARY = "FFmpeg alternate audio resampling library"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libavresample4_0-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "616acbe59b488d66c9c39d46bd1243b286067d94505dc12e8adbbeff74236de1d9cf91c9fb8a35201b28af9f480a6081a028b458b6df896b4df5501f62896696"

RPROVIDES:${PN} += "libavresample.so.4.0 \
libavresample4 \
libavresample4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6"

inherit rpm
