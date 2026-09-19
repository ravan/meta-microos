SUMMARY = "OpenLDAP client utilities"
DESCRIPTION = "OpenLDAP client utilities such as ldapadd, ldapsearch, ldapmodify."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-client-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "67162e0b22d457e694814eb5ce6830be4ab76a5416ea7cc6c181f5fd8a03436fc3d0fa0050789c6557bfc26bca3c984f72c84f51560d509893aa3d37d6acb0da"

RPROVIDES:${PN} += "openldap2-client"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libldap2 \
libsasl2.so.3"

inherit rpm
