SUMMARY = "Static libraries for the OpenLDAP libraries"
DESCRIPTION = "This package provides the static versions of the OpenLDAP libraries \
for development."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-devel-static-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "097c27b5e2aa7957a66d9f57f7cd9fbd4267875b4e96580002f99d1a96b7453fd0923a2edc31fb0aad630570e84875c0e772622fc56272189d63102652084965"

RPROVIDES:${PN} += "openldap2-devel-static"

RDEPENDS:${PN} += "cyrus-sasl-devel \
libopenssl-devel \
openldap2-devel"

inherit rpm
