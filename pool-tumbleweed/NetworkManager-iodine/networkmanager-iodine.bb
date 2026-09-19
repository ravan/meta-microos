SUMMARY = "NetworkManager VPN support for iodine"
DESCRIPTION = "A network manager VPN plugin that allows you to tunnel your connection \
through a DNS tunnel. This can be useful if internet access is \
firewalled but DNS traffic is still allowed."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-iodine-1.2.0-12.5.aarch64.rpm"
RPM_HASH = "e6918e32ea2dc35e751d30b8c588e3bba39dccfe62a594cef41131ccae18691c580b665ddbff17ab4bbb421932cf9e5b85d855c295d776008b7996a9a75162eb"

RPROVIDES:${PN} += "NetworkManager-iodine \
group-nm-iodine \
libnm-vpn-plugin-iodine.so \
user-nm-iodine"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
iodine \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0"

inherit rpm
