SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libcodec2-1_2-1.2.0-2.8.aarch64.rpm"
RPM_HASH = "0fef82b78cc80b3e70fb1199932c2be5ec6615a4eefb4e32c438236e5b2102cbdf10ce59783cdd746c105da07403cb6a7ae273f1cf77ac08d41ca6fc4d601211"

RPROVIDES:${PN} += "libcodec2-1-2 \
libcodec2.so.1.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
