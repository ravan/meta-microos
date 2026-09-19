SUMMARY = "Development files for libvpx, a VP8/VP9 codec library"
DESCRIPTION = "Development headers and library \
 \
WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.16.0"

RPM_NAME = "libvpx-devel-1.16.0-1.4.aarch64.rpm"
RPM_HASH = "85390a7456d455b1dcfa6d73bdf35f7b34f8ac7f0f685bf16ba9bfc38e1f11212b80f6b34b599bcc3aa23f33b2e5f4edd73a442c8234dfc803c9e995310e99ea"

RPROVIDES:${PN} += "libvpx-devel \
pkgconfig-vpx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpx12"

inherit rpm
