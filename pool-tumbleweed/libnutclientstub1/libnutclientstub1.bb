SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared stub library for the Network UPS Tools with memory-backed configurations, \
primarily used by tests and mocks with its and third-party C++ clients. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware. \
 \
Detailed information about supported hardware can be found in \
/usr/share/doc/packages/nut."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "libnutclientstub1-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "45f77423173494a649858b5111b27ee52d8551300789c6e248c56493446e5fc51e43e4f50496c8712161f44da72627f1351e0f46b7be4b06b67cafdcf05dc26a"

RPROVIDES:${PN} += "libnutclientstub.so.1 \
libnutclientstub1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnutclient.so.2 \
libstdc++.so.6"

inherit rpm
