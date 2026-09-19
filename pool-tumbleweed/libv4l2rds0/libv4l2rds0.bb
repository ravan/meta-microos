SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l2rds offers decoding raw RDS data from V4L2 Radio devices and simple ways \
to access the received RDS information. \
 \
This package contains shared lib for packages that use libv4l2rds."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "libv4l2rds0-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "a6893d2afaed6854db429ec532382d1bc7cf8e28d83af49e9a4a2afdd95330e9c626d30efab142b36eff701767bdf61adfe1d2f4646dc07b9a880c1caadf48d8"

RPROVIDES:${PN} += "libv4l2rds.so.0 \
libv4l2rds0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l"

inherit rpm
