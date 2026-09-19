SUMMARY = "Some FFmpeg private headers"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
This package contains some private headers for libavformat, libavcodec and \
libavutil which are needed by libav-tools to build. No other package apart \
from libav should depend on these private headers which are expected to \
break compatibility without any notice."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-private-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "46b86c806607517d1a5975693bb731eaf3aaf1191c79ce9ead7de5263b3c91ea1ca2838b9e32f525dc1c0dcd40ae1a8e3b94619bd6c1c4883d281eedbedaea65"

RPROVIDES:${PN} += "ffmpeg-4-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavutil-devel"

inherit rpm
