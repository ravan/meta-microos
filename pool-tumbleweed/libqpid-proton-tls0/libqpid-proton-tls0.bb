SUMMARY = "Raw connection TLS library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard. \
 \
This subpackage contains the TLS engine for raw connections, which is \
usable independently of the AMQP transport."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "libqpid-proton-tls0-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "8d5b8ac15c430d1602d7afbd295155d1a7ce6d03c8f3d3e1adf960f54bf590bbc5a89afda9d4dc064998ff31807a960e3127f8c9f0643e232499583c109077f3"

RPROVIDES:${PN} += "libqpid-proton-tls.so.0 \
libqpid-proton-tls0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
