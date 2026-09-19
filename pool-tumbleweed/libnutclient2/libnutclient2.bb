SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools, used by its and third-party C++ clients. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware. \
 \
Detailed information about supported hardware can be found in \
/usr/share/doc/packages/nut."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "libnutclient2-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "bcc6299f6342e99a22a215c4c6703e9164a6408a7a522376521bbe54db89953390ef1b646a8b84aad9469c19b665dcb6a8b358acbecf391974a00facc600f3e1"

RPROVIDES:${PN} += "libnutclient.so.2 \
libnutclient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnutprivate-2-8-5-common-client.so.1 \
libstdc++.so.6"

inherit rpm
