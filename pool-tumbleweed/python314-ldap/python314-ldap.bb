SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.7"

RPM_NAME = "python314-ldap-3.4.7-1.3.aarch64.rpm"
RPM_HASH = "94453217ab4f894619df7cd2e7538eb5306047dd0656e3fe74a36668c37f36a47739ebb32cf69f83404df31c6e54999c99d67183173fd3c29e83ff693b5edf17"

RPROVIDES:${PN} += "python3.14dist-python-ldap \
python314-ldap \
python3dist-python-ldap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
python-abi \
python314-pyasn1 \
python314-pyasn1-modules"

inherit rpm
