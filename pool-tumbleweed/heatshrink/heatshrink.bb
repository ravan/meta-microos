SUMMARY = "Data compression library for embedded/real-time systems"
DESCRIPTION = "A data compression/decompression library for embedded/real-time systems. \
 \
Key Features: \
* Low memory usage (as low as 50 bytes) It is useful for some cases with less than 50 bytes, and useful for many general cases with < 300 bytes. \
* Incremental, bounded CPU use You can chew on input data in arbitrarily tiny bites. This is a useful property in hard real-time environments. \
* Can use either static or dynamic memory allocation The library doesn't impose any constraints on memory management. \
* ISC license You can use it freely, even for commercial purposes."
LICENSE = "ISC & AGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "heatshrink-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "9714c46498dc219ec25313ea5e88bb5315fc9eb20ef2cbfab2592934f6a7dbdea244ab421e4184136aaf02d2d475625077d18c52c2a5fc4dead92dba88f3c807"

RPROVIDES:${PN} += "heatshrink"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheatshrink-dynalloc.so.0.4.1"

inherit rpm
