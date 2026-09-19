SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-isc_dhcp_leases-0.10.0-2.10.noarch.rpm"
RPM_HASH = "79f4892d4d5c6dd562962948861a20c3b3401e854d5bebd5e25e1fb9b34358b2d640ceb60220c4de29dd6d10ce332cb4f09e2d872d22f01a4e011ea95e7e4cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isc-dhcp-leases \
python3.13dist-isc-dhcp-leases \
python313-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
