SUMMARY = "Lua bindings for libluv as a library"
DESCRIPTION = "This library makes libuv available to lua scripts. It was made \
for the luvit project but should usable from nearly any lua \
project."
LICENSE = "Apache-2.0"

PV = "1.51.0+1"

RPM_NAME = "libluv1-1.51.0+1-7.3.aarch64.rpm"
RPM_HASH = "02da461cbd85a6365e28c4267540a556c8a343298160f35d2ed04a16d563cc0ceb6069cc1890049746e629f790de2b2701b4e7034b3cd55fa5369667a9f6dd2c"

RPROVIDES:${PN} += "libluv.so.1 \
libluv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libuv.so.1"

inherit rpm
