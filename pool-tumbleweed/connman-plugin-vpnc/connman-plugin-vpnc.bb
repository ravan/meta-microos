SUMMARY = "VPNC plugin for connman"
DESCRIPTION = "Provides VPNC support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-vpnc-1.42-2.16.aarch64.rpm"
RPM_HASH = "081da1951b1a2f1c2d59c30e4dd970fd683c17066f39b02835281656fc913cc4776da28ff2ce76594e6d652c1c99bf2543d114d30466a63286bdf80d4b8fe253"

RPROVIDES:${PN} += "connman-plugin-vpnc"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
vpnc"

inherit rpm
