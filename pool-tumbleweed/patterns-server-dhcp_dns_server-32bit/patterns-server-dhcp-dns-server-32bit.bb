SUMMARY = "DHCP and DNS Server"
DESCRIPTION = "The 32bit pattern complementing dhcp_dns_server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-dhcp_dns_server-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "9bdbe272f9277a04d0cb90cb6eb0c234b33d6ca746c295d59592d75ec1bcbcfbc7800f53aa8b71deb23e4b11648579708db000940ea881f6d302bbc38807b795"

RPROVIDES:${PN} += "pattern- \
patterns-server-dhcp-dns-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
