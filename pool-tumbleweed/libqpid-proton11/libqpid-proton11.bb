SUMMARY = "C library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "libqpid-proton11-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "1e17543e7c734c4651ea87390d8612b7dc052a34b27383026579fc38cf5ba2cc385432acd9f30f2cc7b493cab3db2ed7ed083367511f935ed08a3b8980c82f59"

RPROVIDES:${PN} += "libqpid-proton.so.11 \
libqpid-proton11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
