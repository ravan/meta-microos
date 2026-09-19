SUMMARY = "Shared library for nghttp2"
DESCRIPTION = "Shared C libraries for implementation of Hypertext Transfer Protocol \
version 2."
LICENSE = "MIT"

PV = "1.70.0"

RPM_NAME = "libnghttp2-14-1.70.0-1.1.aarch64.rpm"
RPM_HASH = "f7a1babaf305cca20382613debd6a5bceb55675b21cf4682da397e5a1bf29ee5fff2f039dd0ae8906e7683c02256df6fe0268bfa8264e00f513d18150048933f"

RPROVIDES:${PN} += "libnghttp2-14 \
libnghttp2.so.14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
