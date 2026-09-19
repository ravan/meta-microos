SUMMARY = "Link Layer Discovery Protocol (LLDP) Agent"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) Agent \
with Data Center Bridging (DCB) for Intel(R) Network Connections \
'lldpad' plus the configuration tools 'dcbtool' and 'lldptool'."
LICENSE = "GPL-2.0-only"

PV = "1.1+110.f16f944"

RPM_NAME = "open-lldp-1.1+110.f16f944-1.1.aarch64.rpm"
RPM_HASH = "0900c799207d094ac437b74bd0026260bc9b0e17fba0eb69186ef1f008f2a44be31c7c25cad39f637de6c15096bcb73e82556749cfd9125538180fa77ce1eef0"

RPROVIDES:${PN} += "dcbd \
lldpad \
open-lldp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15 \
liblldp-clif.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
systemd"

inherit rpm
