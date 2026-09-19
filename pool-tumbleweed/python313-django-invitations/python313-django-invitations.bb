SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python313-django-invitations-2.1.0-1.10.noarch.rpm"
RPM_HASH = "9243ea5e74358646c6161fbc3df15efd204f9984b875e9d5bf6d27640419a4833131c5a82bf7697d93e6c0aa691e83e10906a3c4432ccac6f3ca76f439c7a8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-invitations \
python3.13dist-django-invitations \
python313-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
