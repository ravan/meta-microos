SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libavcodec-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "6acaf1f89be7d37b39f6e3eb106e55f6485b993012d28930cd98a41d8b817ea824ca0212e4f2063a16850da56a12b2189abb8152e3783b0badf2429dd69d3962"

RPROVIDES:${PN} += "ffmpeg-8-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-libavutil-devel \
libavcodec62 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
