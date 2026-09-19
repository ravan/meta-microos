SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-ldapdomaindump-0.10.0-1.5.noarch.rpm"
RPM_HASH = "6ea5431ee1bf70dd15771bc403265f1ee72e67b11b4c31533f7b5ac2cda019a5a81443b65284c6a0403faf824246a709d342a0435e5f36ebc6591c3f97a546be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldapdomaindump \
python3.13dist-ldapdomaindump \
python313-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-dnspython \
python313-ldap3 \
update-alternatives"

inherit rpm
