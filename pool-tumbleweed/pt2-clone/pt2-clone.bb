SUMMARY = "ProTracker 2 clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
ProTracker 2.3D."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.92"

RPM_NAME = "pt2-clone-1.92-1.1.aarch64.rpm"
RPM_HASH = "b03fefb38927b2f440086499f5fe31d7563263e628f3f7f10d1da3d1f2fac9cca0c1466ded9f8876fb14ab77fffc655fd258a81c09da062941749494fb48293c"

RPROVIDES:${PN} += "pt2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
