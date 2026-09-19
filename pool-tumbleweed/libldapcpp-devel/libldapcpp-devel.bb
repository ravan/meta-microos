SUMMARY = "C++ wrapper around openLDAP API"
DESCRIPTION = "This package contains files needed for development with the LDAP C++ \
library."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "libldapcpp-devel-2.6.13-1.3.aarch64.rpm"
RPM_HASH = "8677b27b30a4bbcd7261f65612e50f6fb96ac5ef7602f694baf4b3d3e2f7a961752a9b96765ac168f07a2d7445ad8ff000be534aadba8188c8610c6ee988e9c4"

RPROVIDES:${PN} += "libldapcpp-devel"

RDEPENDS:${PN} += "libldapcpp0 \
openldap2-devel"

inherit rpm
