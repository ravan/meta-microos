SUMMARY = "L2TP plugin for connman"
DESCRIPTION = "Provides L2TP (Layer 2 Tunneling Protocol) support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-l2tp-1.42-2.16.aarch64.rpm"
RPM_HASH = "29e383c54095ecbd3d329ffb827708f1261e0734be57e8c8f1dcf2cbc56270ee75f7a83718bbb091a01f0bee506c214e74814cad1080190c9676405eb8cbba21"

RPROVIDES:${PN} += "connman-plugin-l2tp \
libppp-plugin.so"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
