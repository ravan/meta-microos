SUMMARY = "Object serialization library for cross-language communication"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON."
LICENSE = "BSL-1.0"

PV = "7.0.2"

RPM_NAME = "libmsgpack-c2-7.0.2-2.1.aarch64.rpm"
RPM_HASH = "33c443c02aff36fefacc2dad179b5f4a33849211c5609237939584cb2073fa8f814a66fe3f3ec1d8b42bb7a60cd223cacdfb4875adf94686425aefed23d5b6a9"

RPROVIDES:${PN} += "libmsgpack-c.so.2 \
libmsgpack-c2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
