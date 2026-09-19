SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.52.4"

RPM_NAME = "NetworkManager-applet-l2tp-1.52.4-1.1.aarch64.rpm"
RPM_HASH = "bf1f8e62295ed389c929b43cf617333ba65c7a01bc8603704556fec52b3548611200acdb0c0efd024a9b6fce576b8e9a50c8c3e23ce5a7e79f5411f49f3a332a"

RPROVIDES:${PN} += "NetworkManager-applet-l2tp \
NetworkManager-l2tp-gnome \
libnm-gtk4-vpn-plugin-l2tp-editor.so \
libnm-vpn-plugin-l2tp-editor.so"

RDEPENDS:${PN} += "NetworkManager-l2tp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
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
