SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.5"

RPM_NAME = "python313-django-gravatar2-1.4.5-1.2.noarch.rpm"
RPM_HASH = "ac9fa35384a0f6334ea228830a15e94576d015d76804bf53d470d506176762e09a0800ba15f6da1249ff870ca179251b3b5035731de609bbe22e13878bbb0b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-gravatar2 \
python3.13dist-django-gravatar2 \
python313-django-gravatar2 \
python3dist-django-gravatar2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
