SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "python313-django-auth-ldap-5.3.0-1.4.noarch.rpm"
RPM_HASH = "8f744aa7c70569ed55a3c393a06aa5df8fe820beafafc4dd1e373e130604459d28c40c0b5fd360efef81fd86ddfa5a25a1b6783ea7d36391791027e26c0890bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-auth-ldap \
python3.13dist-django-auth-ldap \
python313-django-auth-ldap \
python3dist-django-auth-ldap"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-ldap"

inherit rpm
