SUMMARY = "DHCP and DNS Server"
DESCRIPTION = "Software to set up a server for the Dynamic Host Configuration Protocol (DHCP) and the Domain Name System (DNS) services. DHCP provides configuration parameters to client computers to integrate them into a network, whereas DNS delivers information associated with domain names, in particular, the IP address."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-dhcp_dns_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "f754e22a5f694af8e5ba2fd9102dddfd2189251a22f64d71065e77c2aa993a4bbfeed84ed8cb189e6149a658c98b99c796c20c282d4674128dc2a4067eea8b27"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-dhcp-dns-server \
patterns-server-dhcp-dns-server"

RDEPENDS:${PN} += "bind \
dhcp-server \
pattern-"

inherit rpm
