SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libgviewv4l2core-2_2-2-2.2.2-1.7.aarch64.rpm"
RPM_HASH = "09a8487daa1e2937bf91ec03b895d66ca609e46321ed7dae3c7eedfcca1b77b51585eeef30cedc3f69c818ea34b00248421b4efb86255bc4ce27b73e568884c6"

RPROVIDES:${PN} += "libgviewv4l2core-2-2-2 \
libgviewv4l2core.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libudev.so.1 \
libusb-1.0.so.0 \
libv4l2.so.0"

inherit rpm
