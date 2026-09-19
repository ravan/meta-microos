SUMMARY = "Image grabber for v4l devices"
DESCRIPTION = "vgrabbj is used to grab single images from a video4linux device (e.g. webcam) \
and store it in a file (jpg/png)."
LICENSE = "GPL-2.0+"

PV = "0.9.9"

RPM_NAME = "vgrabbj-0.9.9-1.23.aarch64.rpm"
RPM_HASH = "68b94daac208950ea322be638a2bdb144cd09baa170b4340ed15c9878c57bc8748b058cb276c2672c3c6e0df382d09957c25c4f91640e6d9119def5089aed8e4"

RPROVIDES:${PN} += "config-vgrabbj \
vgrabbj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16 \
libv4l1.so.0"

inherit rpm
