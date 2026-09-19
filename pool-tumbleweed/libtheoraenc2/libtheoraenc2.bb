SUMMARY = "Theora video compression library"
DESCRIPTION = "Theora is a free and open video compression format. It is designed to scale \
well from postage stamp to HD resolution, and is considered particularly \
competitive at low bitrates. \
 \
This subpackage contains the encoder library."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "libtheoraenc2-1.2.0-2.6.aarch64.rpm"
RPM_HASH = "c5b4ecc982323a6a71cf0c29d1a893f5f2c286367f1f4421aa89b0e3d6f243a2731b208db2f3451d84c3630ed9b8b344bb96629bc8e753c7e44cc2fb36d9284e"

RPROVIDES:${PN} += "libtheoraenc.so.2 \
libtheoraenc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0"

inherit rpm
