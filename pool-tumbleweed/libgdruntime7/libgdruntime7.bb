SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libgdruntime7-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "8ed204141ab892e3328aadc73090f9104b21469ee3e3fa563d640cb53857876a94e4bf53055fffee15085e5bb952ac7f99415716b63d50d929e761913dd7fc6f"

RPROVIDES:${PN} += "libgdruntime.so.7 \
libgdruntime7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
