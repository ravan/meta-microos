SUMMARY = "Migration assistant from dhcp to kea"
DESCRIPTION = "This package provides a migration assistant for kea, the successor of the ISC \
DHCP server."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-keama-4.4.3.P1-1.2.aarch64.rpm"
RPM_HASH = "d951432b9ba51cfb2b08a249c4671123ad959e5f5cc18c5b835033ebb12ac718765b9dfe871ae188cb59331a37a91e9041afa5cb8f5705c6644857e5fabd5f72"

RPROVIDES:${PN} += "dhcp-keama"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
