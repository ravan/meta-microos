SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-applet-vpnc-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "0c02767cb4c9e7272d4b934b1523bed89d47770bab407e2b272bd9bec93d2bf33357c95b75a077b133881e55340eaf085f5674086738b661c6c8bc3114b5a3fc"

RPROVIDES:${PN} += "NetworkManager-applet-vpnc \
NetworkManager-vpnc-frontend \
NetworkManager-vpnc-gnome \
libnm-gtk4-vpn-plugin-vpnc-editor.so \
libnm-vpn-plugin-vpnc-editor.so"

RDEPENDS:${PN} += "NetworkManager-vpnc \
gnome-keyring \
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
