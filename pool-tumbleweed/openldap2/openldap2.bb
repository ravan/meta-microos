SUMMARY = "An implementation of the Lightweight Directory Access Protocol"
DESCRIPTION = "OpenLDAP is a client and server reference implementation of the \
Lightweight Directory Access Protocol v3 (LDAPv3). \
 \
The server provides several database backends and overlays."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "1724062d1d2ba7179372d3439b7e2930ae044289409df257378bd435cb23fda6c6da258e3a171834868f8ce7402b873d9e13297a2f9932f5e6e8a0c97f17d9bb"

RPROVIDES:${PN} += "config-openldap2 \
group-ldap \
openldap2 \
user-ldap"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libldap2 \
libltdl.so.7 \
libsasl2.so.3 \
sysuser-shadow"

inherit rpm
