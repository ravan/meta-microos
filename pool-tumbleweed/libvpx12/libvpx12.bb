SUMMARY = "VP8/VP9 codec library"
DESCRIPTION = "WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause"

PV = "1.16.0"

RPM_NAME = "libvpx12-1.16.0-1.4.aarch64.rpm"
RPM_HASH = "cd2dc216b1d3c7739371ba44fd5590a389273643597d0eebd7ff9526f48edb18e11ccc7c1eb5f72f76c9626c2d60e9978720f337481b32efc335a2e37cee49d2"

RPROVIDES:${PN} += "libvpx.so.12 \
libvpx12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
