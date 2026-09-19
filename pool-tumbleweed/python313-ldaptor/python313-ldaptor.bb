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

RPM_NAME = "python313-ldaptor-21.2.0-5.4.noarch.rpm"
RPM_HASH = "66e5bbd1d1b92ad026b7036f8093803aede823fc57a45f79d3c7225b8c0e8b3130d4afe0fc547a20e8849cd5b0535734b530f40bcaa424cf126cc59ad67a86e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldaptor \
python3.13dist-ldaptor \
python313-ldaptor \
python3dist-ldaptor"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Twisted-tls \
python313-passlib \
python313-pyparsing \
python313-zope.interface"

inherit rpm
