SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools, used by its and third-party C clients. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware. \
 \
Detailed information about supported hardware can be found in \
/usr/share/doc/packages/nut."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "libupsclient7-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "2f275acf2cc8f9abf052620b2f24b060798940cc56071daf7c125694ce4c163dea4c1bf01f5d3d2290b5b9b54ec5315197b23ea693b655a2e5d38c7d80bd8558"

RPROVIDES:${PN} += "libupsclient.so.7 \
libupsclient7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnutprivate-2-8-5-common-client.so.1 \
libssl.so.3"

inherit rpm
