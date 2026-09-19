SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools, used by its nut-scanner and nutconf tools, \
and possibly third-party C clients, integrations or tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware. \
 \
Detailed information about supported hardware can be found in \
/usr/share/doc/packages/nut."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "libnutscan4-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "8a1c6ac5cdc69141a87bc9c740a7147b8e4fb1f9d97791a4634c897ae83b1f1da99c54d81261ebfa9ac71c0edee1e93969d1e313e7f319841dd6f5cad168537e"

RPROVIDES:${PN} += "libnutscan.so.4 \
libnutscan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libnutprivate-2-8-5-common-all.so.1"

inherit rpm
