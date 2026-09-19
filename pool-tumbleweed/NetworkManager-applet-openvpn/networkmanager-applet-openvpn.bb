SUMMARY = "NetworkManager VPN support for OpenVPN"
DESCRIPTION = "NetworkManager-openvpn provides VPN support to NetworkManager for \
OpenVPN."
LICENSE = "GPL-2.0-or-later"

PV = "1.12.5"

RPM_NAME = "NetworkManager-applet-openvpn-1.12.5-1.2.aarch64.rpm"
RPM_HASH = "2e0a6a1b51651a9f83bbd0119b21df2423613947d7adb2d7776d5f2326eb41456b79073360a1145bcaa5adb0c44db251669adf72b340c45a9cd9cc13251636b4"

RPROVIDES:${PN} += "NetworkManager-applet-openvpn \
NetworkManager-openvpn-frontend \
NetworkManager-openvpn-gnome \
libnm-gtk4-vpn-plugin-openvpn-editor.so \
libnm-vpn-plugin-openvpn-editor.so"

RDEPENDS:${PN} += "NetworkManager-openvpn \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libnm.so.0 \
libnma-gtk4.so.0 \
libnma.so.0 \
libsecret-1.so.0"

inherit rpm
