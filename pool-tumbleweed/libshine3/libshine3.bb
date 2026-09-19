SUMMARY = "MP3 encoding library"
DESCRIPTION = "Shine is an MP3 encoding library implemented in fixed-point \
arithmetic. The library can be used to perform MP3 encoding on \
architectures without a FPU, such as armel, etc., but likewise works \
on systems with an FPU."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libshine3-3.1.1-2.5.aarch64.rpm"
RPM_HASH = "c86fee12f5b5c2646115a19364c3a102b9217924f2f5bc5e91dc34b9a5c91c651129bb3f01d75a240b5197a97c6632a40797d94bdc0482e57f7f8b4a1e13937f"

RPROVIDES:${PN} += "libshine.so.3 \
libshine3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
