SUMMARY = "Proactor library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "libqpid-proton-proactor1-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "3873119ccb32ec66e8c235b322ae2f99181d732e46a200e6985e1d5592d3a2a01b1b1b7be1121ca1f7623d2fd4e9e99e203c83d5433f75860dd67d1c4120e694"

RPROVIDES:${PN} += "libqpid-proton-proactor.so.1 \
libqpid-proton-proactor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libqpid-proton-core.so.10"

inherit rpm
