SUMMARY = "Utilies from the VP8/VP9 codec library"
DESCRIPTION = "This package contains utilities around the vp8 codec sdk. \
 \
WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.16.0"

RPM_NAME = "vpx-tools-1.16.0-1.4.aarch64.rpm"
RPM_HASH = "3bd14e650ae24da57107a2392baf04ccb2884b2832c41d30d892cf6a3f7c367100686ee6a4a1378180b157511b1787b135a8e9b484c9cf4a057fb7ab4c278833"

RPROVIDES:${PN} += "vpx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvpx.so.12"

inherit rpm
