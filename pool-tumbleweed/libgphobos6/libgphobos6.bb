SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libgphobos6-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "9325b63211dab61481819c04c513455646beffe6b0a1091c5f2be72a13b675f775f24d845548cb860f3321681db4f3abc5948c94b3dacc1941afe7f5e69ef3ae"

RPROVIDES:${PN} += "libgphobos.so.6 \
libgphobos6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
