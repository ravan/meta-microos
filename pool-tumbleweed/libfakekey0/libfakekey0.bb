SUMMARY = "Library for converting characters to X key-presses"
DESCRIPTION = "libfakekey is a simple library for converting UTF-8 characters into \
'fake' X key-presses."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3"

RPM_NAME = "libfakekey0-0.3-2.9.aarch64.rpm"
RPM_HASH = "75c52f1c50a52f69cf242d5e42b5614463674fc482813059870c8d3f43d901922b4554366fe672403b01368d9b03234a9ee82c2a56df639dd648cdb5f6e4558f"

RPROVIDES:${PN} += "libfakekey.so.0 \
libfakekey0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
