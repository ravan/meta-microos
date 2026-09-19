SUMMARY = "FFmpeg plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the FFmpeg plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-ffmpeg-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "4a124fd57357fab692d8faa37577d67188eae2a71eb1162ee6f6832b8c5bee67979829430b9679c2a64d8c3f6d9b5c4c49bc779a11cf395eb3e6a1bdf0f8d28e"

RPROVIDES:${PN} += "audaspace-fileplugin \
audaspace-plugin-ffmpeg \
libaudffmpeg.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
