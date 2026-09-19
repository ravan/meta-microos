SUMMARY = "Library files for libunicode"
DESCRIPTION = " \
The libunicode package contains libraries files for applications \
that use libunicode"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "libunicode0_6-0.6.0-1.7.aarch64.rpm"
RPM_HASH = "08f071ac36b365c803d1b843962a32941d3ec7402bcb1e58e5e4ca2fbde9d3d0d4775758f1a2b04b12649aadc053a09496b8c66ac40a5dfddebdf0496a5a7f5d"

RPROVIDES:${PN} += "libunicode-loader.so.0.6 \
libunicode-ucd.so.0.6 \
libunicode.so.0.6 \
libunicode0-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
