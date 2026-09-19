SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite1-2.2-1.13.aarch64.rpm"
RPM_HASH = "d5e4e58c18787950bb150cad641c97f7cc6d7af4f949047e8f87b822f012feed145a77f138b43033ce1ad31140e10d1bc1b0f442c1fc51d8027ffb846b6478f2"

RPROVIDES:${PN} += "libflite.so.1 \
libflite1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpulse-simple.so.0"

inherit rpm
