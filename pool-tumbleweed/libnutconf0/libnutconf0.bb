SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools, used by its nutconf tool, \
and possibly third-party C++ clients, integrations or tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware. \
 \
Detailed information about supported hardware can be found in \
/usr/share/doc/packages/nut."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "libnutconf0-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "4bfe084684e42a7830885bc6a24e896d63eac6f6083d76e222e79e68b1f19aeb52073d6245930a28b1eb4f32ce635b9f2dbe58036aad6c87b1fba041f6d02596"

RPROVIDES:${PN} += "libnutconf.so.0 \
libnutconf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnutprivate-2-8-5-common-client.so.1 \
libstdc++.so.6"

inherit rpm
