SUMMARY = "FFmpeg input plugin for the C* Music Player"
DESCRIPTION = "This package provides FFmpeg input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-ffmpeg-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "8f77f29215dcc94a0959228e03e9d98d73d317d5a0f891ae82b33d58d8ef2bbbeb76855745e0a67f11c799c531158c68017b906ba9732eb7f7205bb93b876437"

RPROVIDES:${PN} += "cmus-plugin-ffmpeg"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libc.so.6 \
libswresample.so.6"

inherit rpm
