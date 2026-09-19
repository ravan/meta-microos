SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libgphobos5-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "f4c769c6fd79b0cba41c442c1b9bf3da0edcb0f0091a91f7e39f781970f57d29ff8df6dc5129757d852d74a8d29f72315aed078f64dadf6551d8a67cd2b73cae"

RPROVIDES:${PN} += "libgphobos.so.5 \
libgphobos5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
