SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-applet-openconnect-1.2.10-5.5.aarch64.rpm"
RPM_HASH = "aa0ec1d34b9431c09542d988cf0877504bce36a690b78b13cd556c72256161393117215162d7be13164d6989dbf58e2ad47052747051dca8fb37250c05875313"

RPROVIDES:${PN} += "NetworkManager-applet-openconnect \
NetworkManager-openconnect-frontend \
NetworkManager-openconnect-gnome \
libnm-gtk4-vpn-plugin-openconnect-editor.so \
libnm-vpn-plugin-openconnect-editor.so"

RDEPENDS:${PN} += "NetworkManager-openconnect \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libnm.so.0 \
libnma-gtk4.so.0 \
libnma.so.0 \
libopenconnect.so.5 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.16"

inherit rpm
