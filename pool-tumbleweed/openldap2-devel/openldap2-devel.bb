SUMMARY = "Libraries, Header Files and Documentation for OpenLDAP"
DESCRIPTION = "This package provides the OpenLDAP libraries, header files, and \
documentation."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-devel-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "36be882a9a234b359ca3db28674c5629e63ef9911506bfd21361d56c9f4cdaa6255ea4a09d228544e4348f1eed3244da7473905c42056420f786501410f38d76"

RPROVIDES:${PN} += "openldap2-devel \
pkgconfig-lber \
pkgconfig-ldap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldap2 \
pkgconfig-lber"

inherit rpm
