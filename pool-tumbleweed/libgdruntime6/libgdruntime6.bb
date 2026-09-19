SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libgdruntime6-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "50ca028c77a807835ba0a5d52d3e3f3a8e8ff93016fbabd96da81c99d5ea708d52fd7316f95cf45cee5fb1377211f71b9595da1e2109aec37672b282d5df1c98"

RPROVIDES:${PN} += "libgdruntime.so.6 \
libgdruntime6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
