SUMMARY = "Virtual Organization Membership Service Clients"
DESCRIPTION = "The Virtual Organization Membership Service (VOMS) is an attribute authority \
which serves as central repository for VO user authorization information, \
providing support for sorting users into group hierarchies, keeping track of \
their roles and other attributes in order to issue trusted attribute \
certificates and SAML assertions used in the Grid environment for \
authorization purposes. \
 \
This package provides command line applications to access the VOMS services."
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "voms-clients-2.1.3-1.3.aarch64.rpm"
RPM_HASH = "98935784dc9944e6e766884dab27dfeea0d303a46912774e79d318a5981b9ebdce13d6ffde8eab83bf53aca9c3e54584ce5e00936983265cf120f6bae7700b5b"

RPROVIDES:${PN} += "voms-clients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libvomsapi.so.1 \
libvomsapi1"

inherit rpm
