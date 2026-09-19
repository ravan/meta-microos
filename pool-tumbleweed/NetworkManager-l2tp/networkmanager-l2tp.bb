SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.52.4"

RPM_NAME = "NetworkManager-l2tp-1.52.4-1.1.aarch64.rpm"
RPM_HASH = "42a18177d696e256065a7959d9cbe0b6489e736ae055d6a495eb048a9522abac76b2b2d3bd895093e8a87f087f90f8ba405f426c3427f40d3186ecb7209c134f"

RPROVIDES:${PN} += "NetworkManager-l2tp \
libnm-vpn-plugin-l2tp.so"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libnspr4.so \
libnss3.so \
libsmime3.so \
ppp \
xl2tpd"

inherit rpm
