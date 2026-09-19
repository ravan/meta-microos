SUMMARY = "OpenVPN plugin for connman"
DESCRIPTION = "Provides OpenVPN support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-openvpn-1.42-2.16.aarch64.rpm"
RPM_HASH = "18a6133542917d0623fc1d69ef32804fa9be73a72efb58a1c70357e303f7a3e98ae3d59993959d805f5596e2cef44a98cb6fdd211c52c2f6e3212ab79d9af995"

RPROVIDES:${PN} += "connman-plugin-openvpn"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
openvpn"

inherit rpm
