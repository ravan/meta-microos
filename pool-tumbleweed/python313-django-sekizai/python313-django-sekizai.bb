SUMMARY = "Django Template Blocks with extra functionality"
DESCRIPTION = "Django Template Blocks with extra functionality"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-django-sekizai-4.1.0-2.5.noarch.rpm"
RPM_HASH = "757b6e6aba8fa640f3a89e24ed78466a31b5deb49620881f7229b709eb2a2efa9bdee1a9f5de34802871bd73e29eea86d67d39f06363848a5c2ff44598c0cfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-sekizai \
python3.13dist-django-sekizai \
python313-django-sekizai \
python3dist-django-sekizai"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-classy-tags"

inherit rpm
