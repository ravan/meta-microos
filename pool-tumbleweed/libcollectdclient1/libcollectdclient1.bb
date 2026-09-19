SUMMARY = "Library for collectd clients"
DESCRIPTION = "Library which abstracts communication with the collectd \
unixsock plugin for clients."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "libcollectdclient1-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "fcc2633ef0f401a86bc1cc6d21f5e27a691d4adf28ea78d81bd01d6bc79609841d24c8ae0f2e2bfa85fa998f95023bf0089d6f14e054504052641143c7b24be6"

RPROVIDES:${PN} += "libcollectdclient \
libcollectdclient.so.1 \
libcollectdclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
