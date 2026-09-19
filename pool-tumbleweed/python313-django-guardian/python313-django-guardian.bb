SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-2-Clause"

PV = "3.3.4"

RPM_NAME = "python313-django-guardian-3.3.4-1.1.noarch.rpm"
RPM_HASH = "ccdc026f03c7e7f13311bcc75ec5de26aaf9278ea47aba78a26f5162155372d7010f4032212be032c02d36d119e86bae3b4265aae3053d05690910d677c41c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-guardian \
python3.13dist-django-guardian \
python313-django-guardian \
python3dist-django-guardian"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-typing-extensions"

inherit rpm
