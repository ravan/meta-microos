SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4lconvert offers functions to convert from any (known) pixel-format \
to V4l2_PIX_FMT_BGR24 or V4l2_PIX_FMT_YUV420. \
 \
This package contains shared lib for packages that use libv4lconvert."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "libv4lconvert0-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "499e2cdf0c4edf2e03f3b50f0803e1505fdc5e0ff663007230fb5937cd102d1b37b99bb78402eac5030eb8d1f0893f010850d57bfef7c57bfdab3df0cca1a3e0"

RPROVIDES:${PN} += "libv4lconvert.so.0 \
libv4lconvert0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libv4l"

inherit rpm
