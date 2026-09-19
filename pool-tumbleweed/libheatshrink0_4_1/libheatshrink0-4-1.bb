SUMMARY = "Data compression library for embedded/real-time systems"
DESCRIPTION = "A data compression/decompression library for embedded/real-time systems."
LICENSE = "ISC & AGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libheatshrink0_4_1-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "2ea5ca8da3f49d9028cdd0ff84ca64c616b7fe25634ea997d2027f475b838776af375ab0252f32c3a9e05eec48c860a457e4befe08246a907c28ac6e4b495adb"

RPROVIDES:${PN} += "libheatshrink.so.0.4.1 \
libheatshrink0-4-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
