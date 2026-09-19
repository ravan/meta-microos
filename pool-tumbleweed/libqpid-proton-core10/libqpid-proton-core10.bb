SUMMARY = "Core library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "libqpid-proton-core10-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "4b2a557bc5fbe39f0985e7f8df2c219757b0e7a2df702a8431b856e6c68350c67e63058e04860118ef9949254d40c73e5250461498fcb52f209631fd0fd86d94"

RPROVIDES:${PN} += "libqpid-proton-core.so.10 \
libqpid-proton-core10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
