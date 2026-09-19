SUMMARY = "NetworkManager VPN support for OpenVPN"
DESCRIPTION = "NetworkManager-openvpn provides VPN support to NetworkManager for \
OpenVPN."
LICENSE = "GPL-2.0-or-later"

PV = "1.12.5"

RPM_NAME = "NetworkManager-openvpn-1.12.5-1.2.aarch64.rpm"
RPM_HASH = "4a3d26f69632680d0ce997956c17dd67c87fdc3329a8087ca873f04790c717deb40792bd6e893b649afde45661209e1d7ff90bdff000a0d08417b4248e26d154"

RPROVIDES:${PN} += "NetworkManager-openvpn \
group-nm-openvpn \
libnm-vpn-plugin-openvpn.so \
user-nm-openvpn"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
openvpn \
sysuser-shadow"

inherit rpm
