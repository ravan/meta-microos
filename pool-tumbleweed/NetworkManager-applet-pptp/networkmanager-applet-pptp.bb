SUMMARY = "NetworkManager VPN support for PPTP"
DESCRIPTION = "NetworkManager-pptp provides VPN support to NetworkManager for PPTP."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "NetworkManager-applet-pptp-1.2.12-3.10.aarch64.rpm"
RPM_HASH = "9dd9221246cf65fa4d2ef6b99b74ff2b6ee7028a975d5a983bcfe2bd0c2666064dac5872219666c5e599ca6be11a3aa2590918b812edf84679d249aa425f92ac"

RPROVIDES:${PN} += "NetworkManager-applet-pptp \
NetworkManager-pptp-frontend \
NetworkManager-pptp-gnome \
libnm-gtk4-vpn-plugin-pptp-editor.so \
libnm-vpn-plugin-pptp-editor.so"

RDEPENDS:${PN} += "NetworkManager-pptp \
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
