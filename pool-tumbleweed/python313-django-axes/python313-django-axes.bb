SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "8.3.1"

RPM_NAME = "python313-django-axes-8.3.1-1.3.noarch.rpm"
RPM_HASH = "ffe5744bb27f22d56675b7d9bf3d2f7950d1b6cc5cb70e07c5cecfe9f6e44b3c7dc09f3e05fa5346ed0aaa42f3aaf5f91167dd7abd44af4a5faaccf1243ebf38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-axes \
python3.13dist-django-axes \
python313-django-axes \
python3dist-django-axes"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-asgiref"

inherit rpm
