SUMMARY = "Library to parse flash media stream URLs"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-0_9-0_9_4-0.9.4-8.11.aarch64.rpm"
RPM_HASH = "103ad5d58bd340b8f6f14b8139def117cd5c2a2a0e2048b24abdb7990c768af2fe411d599e7481da955d1de1a48a24146877b3b683135e9b5548026ddc2365d4"

RPROVIDES:${PN} += "libquvi \
libquvi-0-9-0-9-4 \
libquvi-0.9-0.9.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
liblua5.4.so.5 \
libproxy.so.1"

inherit rpm
