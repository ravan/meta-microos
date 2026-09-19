SUMMARY = "C++ library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "libqpid-proton-cpp12-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "c22fc4ae7432c6a0f0c4a0b1e1d9ffcfefa4fad9f61bcdb01b6738f24a42bd6337467508fc7b3da62d1ffd6b37bf272e7800678497e409419bbe407ae9229114"

RPROVIDES:${PN} += "libqpid-proton-cpp.so.12 \
libqpid-proton-cpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpid-proton-core.so.10 \
libqpid-proton-proactor.so.1 \
libstdc++.so.6"

inherit rpm
