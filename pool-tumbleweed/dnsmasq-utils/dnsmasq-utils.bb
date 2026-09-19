SUMMARY = "Utilities for manipulating DHCP server leases"
DESCRIPTION = "Utilities that use the standard DHCP protocol to query/remove a DHCP \
server's leases."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.93"

RPM_NAME = "dnsmasq-utils-2.93-2.3.aarch64.rpm"
RPM_HASH = "69e08005b0e555de0bda0b4a3a0ed29bb964d186ce1e301a47f4bed683a907b3b978dd96625fe61cb902a0999bfb9fa4a6b93a246c96f8e3cd73442760c80946"

RPROVIDES:${PN} += "dnsmasq-utils"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
