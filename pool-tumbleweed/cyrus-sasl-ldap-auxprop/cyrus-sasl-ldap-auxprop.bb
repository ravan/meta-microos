SUMMARY = "The cyrus-sasl LDAP auxprop plugin"
DESCRIPTION = "The LDAP auxprop plugin allows for tighter application/directory \
integration."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ldap-auxprop-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "1877261e9a87bec2c6b146188f4eaf06cae3c9c9ab480487319522593f5be753a93fefc0fcf4711dea4d9ef8bacb6e794ab4cd3ab961f0be7fb5082a53b53bc4"

RPROVIDES:${PN} += "cyrus-sasl-ldap-auxprop \
libldapdb.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2"

inherit rpm
