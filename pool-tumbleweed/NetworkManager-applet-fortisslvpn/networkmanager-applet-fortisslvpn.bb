SUMMARY = "NMA files for the NetworkManager SSLVPN plugin"
DESCRIPTION = "This package contains the NMA files for integrating \
Fortinet-compatible SSLVPN server VPN capabilities with \
NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-applet-fortisslvpn-1.4.0-5.11.aarch64.rpm"
RPM_HASH = "aedc68d77ad064a5d7516b6f24a882099b83a98a9af99b99cae146a236fb279a0befccdaabc92a92d6d467590d36c3f3cc58bd3afc51b1920ddbdb1c36fd0f87"

RPROVIDES:${PN} += "NetworkManager-applet-fortisslvpn \
NetworkManager-fortisslvpn-gnome \
libnm-gtk4-vpn-plugin-fortisslvpn-editor.so \
libnm-vpn-plugin-fortisslvpn-editor.so"

RDEPENDS:${PN} += "NetworkManager-fortisslvpn \
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
