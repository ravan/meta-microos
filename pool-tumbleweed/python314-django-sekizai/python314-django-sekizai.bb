SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-django-sekizai-4.1.0-2.5.noarch.rpm"
RPM_HASH = "dbc6c93c05e55a709bbd47ef2cafbecefcb031f04c805062cee7b582d511b5f2234fff54e0f4b578cdf233ab5250488721e77725c17ba74a516a006047164f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-sekizai \
python314-django-sekizai \
python3dist-django-sekizai"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-classy-tags"

inherit rpm
