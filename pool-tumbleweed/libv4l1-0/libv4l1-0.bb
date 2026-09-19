SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l1 offers the (deprecated) v4l1 API on top of v4l2 devices, independent \
of the drivers for those devices supporting v4l1 compatibility (which many \
v4l2 drivers do not). \
 \
This package contains shared lib for packages that use libv4l1."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "libv4l1-0-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "f361b9ab789dc9e3ffffdfa5103fa8e321702952b1a6497acd8c37bfec952150f2ddc15f330af55ee14cd9faf43402b9db9d8ffc118efea7da5eb11633ed856f"

RPROVIDES:${PN} += "libv4l1-0 \
libv4l1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l \
libv4l2.so.0"

inherit rpm
