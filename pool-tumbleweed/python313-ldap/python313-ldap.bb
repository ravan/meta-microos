SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.7"

RPM_NAME = "python313-ldap-3.4.7-1.3.aarch64.rpm"
RPM_HASH = "ab89fb4511c5acb439cfd9227937ed8d5d60a4b9b25909c771c0cba4f2b35d097120615597489ae4bbb7f6c86b4cbaa52dfad833634969987e272992fe6caf47"

RPROVIDES:${PN} += "python3-ldap \
python3.13dist-python-ldap \
python313-ldap \
python3dist-python-ldap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
python-abi \
python313-pyasn1 \
python313-pyasn1-modules"

inherit rpm
