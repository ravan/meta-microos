SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-vpnc-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "71606cce12f851a31671fe4be8dbdd065ef214866210575432831a75763d1ff0592f3b49d5f8cf980403c0e2cc80112e9160b771ee7f81ef3e9544e71d131312"

RPROVIDES:${PN} += "NetworkManager-vpnc \
libnm-vpn-plugin-vpnc.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
vpnc"

inherit rpm
