SUMMARY = "Metapackage to make nft the default backend for iptables/arptables/ebtables"
DESCRIPTION = "Installation of this package adds higher priority alternatives (cf. \
update-alternatives) that makes the iptables, ip6tables, arptables \
and ebtables commands point to a program variant that uses the \
nftables kernel interface."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "iptables-backend-nft-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "7a807919a148ae8251245f513eb2e5f9c417b189d5e45fb9d0a0fe82924f6f7ae18e5003c5297e47ac2b344ae2f5363a3b00c9a404d19abe9f51ba06bbef03e6"

RPROVIDES:${PN} += "iptables-backend-nft \
iptables-nft"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
iptables"

inherit rpm
