SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-isc_dhcp_leases-0.10.0-2.10.noarch.rpm"
RPM_HASH = "d2ab1f832c05a2bdc8d79f6f37ab413fb7f02c5194a0139677147d0fa0e182b1ee32f73b5a7be2fe03473889303e32c7970b5ee832f00aedddf7a047aa7a821f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-isc-dhcp-leases \
python314-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
