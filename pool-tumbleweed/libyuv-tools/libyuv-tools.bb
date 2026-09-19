SUMMARY = "Command line utilities from libyuv"
DESCRIPTION = "libyuv is a project for YUV image scaling and conversion. It can \
convert between RGB and YUV, scale images with point/bilinear/box \
filter, rotate by 90/180/270°, and offers SSE/NEON/MSA acceleration. \
 \
This package contains the yuvconvert and yuvconstants commandline programs."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv-tools-20230517+a377993-2.5.aarch64.rpm"
RPM_HASH = "3f718d2850e76d000ddbb5bcb6ea859eeb3814752f304858858d29378509768a75a9dda6ae08eb5cf88452e3d36ba8474047950bccf71b42c6a748e7e274a59f"

RPROVIDES:${PN} += "libyuv-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyuv.so.0"

inherit rpm
