SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "python314-django-auth-ldap-5.3.0-1.4.noarch.rpm"
RPM_HASH = "cfb7921f28ed1c2c75c5852993c2adfe468534a16d53849d85f56c58d557fd5b4fa3259751f7d167c2e6cbf766daf688d50e516e348df4c41d09693da0c68450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-auth-ldap \
python314-django-auth-ldap \
python3dist-django-auth-ldap"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-ldap"

inherit rpm
