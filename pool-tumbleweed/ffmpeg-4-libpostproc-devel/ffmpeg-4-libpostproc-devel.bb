SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libpostproc-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "baf63ce565d2bb9cf977f07d3efcdc9fea89cc95b3524307cc177283452d0aa2fa9b5ed66df85c80ed8b39fdad0c60188d30f9d2a0e3504a7939cb8e792571d7"

RPROVIDES:${PN} += "ffmpeg-4-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libpostproc55-9 \
pkgconfig-libavutil"

inherit rpm
