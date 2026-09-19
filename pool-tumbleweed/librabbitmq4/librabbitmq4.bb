SUMMARY = "Client library for AMQP"
DESCRIPTION = "This is a C-language AMQP client library for use with AMQP servers \
speaking protocol versions 0-9-1."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "librabbitmq4-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "e6dcc5705a8fcfc70e530caf33f449edea737a14d00ac86794cd364aa7815305ceeddaf62e980f475cbcb4e04178fe9014e9bef2edfad984e62fa56f9024d57a"

RPROVIDES:${PN} += "librabbitmq.so.4 \
librabbitmq4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
