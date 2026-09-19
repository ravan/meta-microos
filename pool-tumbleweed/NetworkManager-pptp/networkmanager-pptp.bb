SUMMARY = "NetworkManager VPN support for PPTP"
DESCRIPTION = "NetworkManager-pptp provides VPN support to NetworkManager for PPTP."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "NetworkManager-pptp-1.2.12-3.10.aarch64.rpm"
RPM_HASH = "74b33a61337fecf4670960952d32545049fa6554f21b400051221b21bceed583ca0581e36489a25013de9d1acef4b765b8c229146072edeebf91ea9322e4e103"

RPROVIDES:${PN} += "NetworkManager-pptp \
libnm-vpn-plugin-pptp.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
ppp \
pptp"

inherit rpm
