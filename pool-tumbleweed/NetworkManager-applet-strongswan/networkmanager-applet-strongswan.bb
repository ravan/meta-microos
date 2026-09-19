SUMMARY = "NetworkManager VPN support for strongSwan"
DESCRIPTION = "NetworkManager-strongswan provides VPN support to NetworkManager for \
strongSwan."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.5"

RPM_NAME = "NetworkManager-applet-strongswan-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "abacbabe4304fd5508a947c8b904307db333553e401460fe886021aa8f7f35fe94b2abd9adf1cd2da017c01df85a953d1bb465a94e231cb994e6dd434ba5d5c8"

RPROVIDES:${PN} += "NetworkManager-applet-strongswan \
NetworkManager-strongswan-frontend \
NetworkManager-strongswan-gnome \
libnm-gtk4-vpn-plugin-strongswan-editor.so \
libnm-vpn-plugin-strongswan-editor.so"

RDEPENDS:${PN} += "NetworkManager-strongswan \
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
