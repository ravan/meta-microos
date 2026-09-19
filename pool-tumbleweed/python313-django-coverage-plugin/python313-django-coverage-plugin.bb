SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python313-django-coverage-plugin-3.2.2-1.2.noarch.rpm"
RPM_HASH = "42577082d9f8b194bbbe7d472849bd29b3e0084e54a909fd676bdd3aba864e8569ce7766ec9446e6c6d1989e430e3e365f4cac7436e75ef68cfcb7ddb5f934bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-coverage-plugin \
python3.13dist-django-coverage-plugin \
python313-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-coverage"

inherit rpm
