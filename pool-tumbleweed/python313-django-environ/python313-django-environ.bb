SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python313-django-environ-0.14.0-1.2.noarch.rpm"
RPM_HASH = "90fb4eb882c3a37bc1363102497900ccdbcedc2d377760e2005a517ef3f0a1e32b2bc58f6f8e4e7b1982c03f8f9b4519f4bb19ffe301f50272c03c6f3b0174c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-environ \
python3.13dist-django-environ \
python313-django-environ \
python3dist-django-environ"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
