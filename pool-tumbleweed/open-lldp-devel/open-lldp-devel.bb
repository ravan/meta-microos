SUMMARY = "Link Layer Discovery Protocol (LLDP) Agent"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) Agent \
with Data Center Bridging (DCB) for Intel(R) Network Connections \
'lldpad' plus the configuration tools 'dcbtool' and 'lldptool'."
LICENSE = "GPL-2.0-only"

PV = "1.1+110.f16f944"

RPM_NAME = "open-lldp-devel-1.1+110.f16f944-1.1.aarch64.rpm"
RPM_HASH = "5d049c50e2829176c8602c0f7dabb37c7dc08c75194b84366936bed07bc8bc6f737a7f91843401ba8d201b2aafba29d3ac4485868915edb77191d97c53ad1dc3"

RPROVIDES:${PN} += "dcbd-devel \
lldpad-devel \
open-lldp-devel \
pkgconfig-liblldp-clif \
pkgconfig-lldpad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblldp-clif1 \
open-lldp"

inherit rpm
