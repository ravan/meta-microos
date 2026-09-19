SUMMARY = "Generic invitations app with support for Django-allauth"
DESCRIPTION = "Generic invitations app with support for Django-allauth."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python314-django-invitations-2.1.0-1.10.noarch.rpm"
RPM_HASH = "f6b5f0afea51770b0b3bcae2f4d57e4f18b74a999a216450b53220febfe1e06b6d5ae6514f9dcbd7dfdf7c42790d29e249983fb12be4b2c64077867d3e4ce3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-invitations \
python314-django-invitations \
python3dist-django-invitations"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
