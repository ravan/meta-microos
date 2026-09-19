SUMMARY = "LDAP module that wraps the OpenLDAP C SDK"
DESCRIPTION = "A perl LDAP module that wraps the OpenLDAP C SDK."
LICENSE = "MPL-1.1 | GPL-2.0+ | LGPL-2.0+"

PV = "1.5.3"

RPM_NAME = "perl-Mozilla-LDAP-1.5.3-7.14.aarch64.rpm"
RPM_HASH = "7c6cd2747977e35635e8a09b225f2ea21def9e419c79c2a5650c7c33f293af309b15f71374e80ec0a7af9295fb08e2ae4a206c3ade77f9ca0d3af8bd9314155e"

RPROVIDES:${PN} += "perl-Mozilla--LDAP--API \
perl-Mozilla--LDAP--Conn \
perl-Mozilla--LDAP--Entry \
perl-Mozilla--LDAP--LDIF \
perl-Mozilla--LDAP--Utils \
perl-Mozilla-LDAP \
perl-SearchIter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
perl-base"

inherit rpm
