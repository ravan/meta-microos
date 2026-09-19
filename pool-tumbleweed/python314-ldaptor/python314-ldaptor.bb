SUMMARY = "A Pure-Python Twisted library for LDAP"
DESCRIPTION = "Ldaptor is a pure-Python library that implements: \
 \
- LDAP client logic \
- separately-accessible LDAP and BER protocol message generation/parsing \
- ASCII-format LDAP filter generation and parsing \
- LDIF format data generation \
- Samba password changing logic"
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python314-ldaptor-21.2.0-5.4.noarch.rpm"
RPM_HASH = "0aca131a473da9c6aa8b1c0ef862849c1e4de37eedec1180123ea8d06f16d147747751c50cadc667f06104c8c2c85989c7259351dacc715a2e9c34a902ab03f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ldaptor \
python314-ldaptor \
python3dist-ldaptor"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Twisted-tls \
python314-passlib \
python314-pyparsing \
python314-zope.interface"

inherit rpm
