SUMMARY = "The Virtual Organisation Membership Service C++ APIs"
DESCRIPTION = "The Virtual Organization Membership Service (VOMS) is an attribute authority \
which serves as central repository for VO user authorization information, \
providing support for sorting users into group hierarchies, keeping track of \
their roles and other attributes in order to issue trusted attribute \
certificates and SAML assertions used in the Grid environment for \
authorization purposes. \
 \
This package provides libraries that applications using the VOMS functionality \
will bind to."
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "libvomsapi1-2.1.3-1.3.aarch64.rpm"
RPM_HASH = "779dc08d7b93ac4f3ae2962312ec018b3568a55cc63fad47401aa86b94b7b962804ea0f56ea642e30401ac5fb513688cf9f4b48312b72d4495f63077c32d787b"

RPROVIDES:${PN} += "libvomsapi.so.1 \
libvomsapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
