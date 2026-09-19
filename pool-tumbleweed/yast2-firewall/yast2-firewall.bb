SUMMARY = "YaST2 - Firewall Configuration"
DESCRIPTION = "A YaST2 module to be used for configuring a firewall."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-firewall-5.0.2-1.2.noarch.rpm"
RPM_HASH = "909b175f103d36ec692beb34481346ba1b5b27bece452431e70c432535de17ccb7780b5162b0621dfe716ea3591fff2c7aa41986cf8ff8dfde429954013870b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-config-firewall \
yast2-firewall \
yast2-trans-firewall"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
