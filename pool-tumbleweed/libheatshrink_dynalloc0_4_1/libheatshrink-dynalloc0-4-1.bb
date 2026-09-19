SUMMARY = "Data compression library for embedded/real-time systems"
DESCRIPTION = "A data compression/decompression library for embedded/real-time systems."
LICENSE = "ISC & AGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libheatshrink_dynalloc0_4_1-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "38ccf43a5beb5263c2f231bf0e7d87093f931f2f0f9249102faa0fe61f0978001ba5d88cf4e3ea6ec37d56cdfe5733d6eb44a4e1b3bfea08ebc7acbfcd3864cd"

RPROVIDES:${PN} += "libheatshrink-dynalloc.so.0.4.1 \
libheatshrink-dynalloc0-4-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
