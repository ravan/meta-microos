SUMMARY = "Development libraries for writing messaging apps with Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.40.0"

RPM_NAME = "qpid-proton-devel-0.40.0-1.1.aarch64.rpm"
RPM_HASH = "3f54a193e01c59c10581e98c005a2f0bcab7fac6066c38b264e6a6ffecc269de33aa41d207f785b2d358c172584d2d430efbe6a85f62a76682e2621238798a79"

RPROVIDES:${PN} += "cmake-Proton \
cmake-ProtonCpp \
pkgconfig-libqpid-proton \
pkgconfig-libqpid-proton-core \
pkgconfig-libqpid-proton-cpp \
pkgconfig-libqpid-proton-proactor \
pkgconfig-libqpid-proton-tls \
qpid-proton-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqpid-proton-core10 \
libqpid-proton-cpp12 \
libqpid-proton-proactor1 \
libqpid-proton-tls0 \
libqpid-proton11 \
pkgconfig-libqpid-proton-core \
pkgconfig-libqpid-proton-proactor"

inherit rpm
