SUMMARY = "NetworkManager VPN plugin for libreswan - NMA files"
DESCRIPTION = "This package contains software for integrating VPN capabilities \
with the libreswan server with NetworkManager (NMA files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.30"

RPM_NAME = "NetworkManager-applet-libreswan-1.2.30-1.4.aarch64.rpm"
RPM_HASH = "287cfc4e8d2b6e1b93fcd34a17e6d73a14e8e7faf5288d8506590c9d2a48ecad9add9564cd0edafad7b34b466138bb06eb6feef0f678fc986823687927599e1e"

RPROVIDES:${PN} += "NetworkManager-applet-libreswan \
NetworkManager-libreswan-gnome \
NetworkManager-openswan-gnome \
libnm-gtk4-vpn-plugin-libreswan-editor.so \
libnm-vpn-plugin-libreswan-editor.so"

RDEPENDS:${PN} += "NetworkManager-libreswan \
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
