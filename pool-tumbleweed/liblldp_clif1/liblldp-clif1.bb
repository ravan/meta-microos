SUMMARY = "Link Layer Discovery Protocol (LLDP) libraries"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) libraries"
LICENSE = "GPL-2.0-only"

PV = "1.1+110.f16f944"

RPM_NAME = "liblldp_clif1-1.1+110.f16f944-1.1.aarch64.rpm"
RPM_HASH = "7d3bbe18147507acd60475d6b7543a6ae53b5c890257776000746be2e195566af6d36230ff67a66648b3e380ccb89b82d181fc05453e3168c36610a62e4b2260"

RPROVIDES:${PN} += "liblldp-clif.so.1 \
liblldp-clif1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
