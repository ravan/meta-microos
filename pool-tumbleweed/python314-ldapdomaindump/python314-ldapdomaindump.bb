SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-ldapdomaindump-0.10.0-1.5.noarch.rpm"
RPM_HASH = "9249c3f91fbd5d41e17907705e7a9b633a4ac7b99faa9a1c62e97bf1649f4081221cd727f5bf6bd7229221a6b7b614d3cee35357042fc9769bd047d3863d5990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ldapdomaindump \
python314-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-dnspython \
python314-ldap3 \
update-alternatives"

inherit rpm
