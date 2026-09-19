SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "codec2-1.2.0-2.8.aarch64.rpm"
RPM_HASH = "8ee0e3ea8496266adfd5677d2a7915e6f8afa5027fc59398eb7de730acd6d44730a4c080593c4cf4ae3dd30ae5f35cf06a9ff84790f6a9a9999ace41c2860b5e"

RPROVIDES:${PN} += "codec2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcodec2.so.1.2 \
libm.so.6"

inherit rpm
