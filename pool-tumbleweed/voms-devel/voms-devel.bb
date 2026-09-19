SUMMARY = "Virtual Organization Membership Service Development Files"
DESCRIPTION = "The Virtual Organization Membership Service (VOMS) is an attribute authority \
which serves as central repository for VO user authorization information, \
providing support for sorting users into group hierarchies, keeping track of \
their roles and other attributes in order to issue trusted attribute \
certificates and SAML assertions used in the Grid environment for \
authorization purposes. \
 \
This package provides header files for programming with the VOMS libraries."
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "voms-devel-2.1.3-1.3.aarch64.rpm"
RPM_HASH = "53cb7a63e920c8ddd180bc5c0b9cfb1b9c890eca8499508e706e43203f8a2342317fa1c7abb57677ed4cb28896ff5cfac244b0638089222881ea62346f43665c"

RPROVIDES:${PN} += "pkgconfig-voms-2.0 \
voms-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
automake \
libopenssl-devel \
libvomsapi1 \
pkgconfig-openssl"

inherit rpm
