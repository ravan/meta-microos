SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libpostproc-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "0db6a2312f5326d2e8147180c45a2605ccdf061cb013e3fdc83dc030dcb3dce78bbac1184f6f7379b1c00879305210615044096a944686b78fdd46dbcd7915f7"

RPROVIDES:${PN} += "ffmpeg-7-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavutil-devel \
libpostproc58 \
pkgconfig-libavutil"

inherit rpm
