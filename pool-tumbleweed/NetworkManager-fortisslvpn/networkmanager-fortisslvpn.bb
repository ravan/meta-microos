SUMMARY = "NetworkManager VPN plugin for Fortinet compatible SSLVPN"
DESCRIPTION = "This package contains software for integrating Fortinet compatible \
SSLVPN server VPN capabilities with with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-fortisslvpn-1.4.0-5.11.aarch64.rpm"
RPM_HASH = "845421f0a8de2948df7ce556631a8d3aef5ea6c10d39500ae832b2662b829b5a58791bc263f152374c1b40606f755193dec2f5c8527cdeb65467142040f34a37"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn \
libnm-vpn-plugin-fortisslvpn.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
openfortivpn \
ppp"

inherit rpm
