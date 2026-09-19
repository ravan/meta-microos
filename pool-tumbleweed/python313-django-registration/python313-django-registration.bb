SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "5.2.1"

RPM_NAME = "python313-django-registration-5.2.1-1.3.noarch.rpm"
RPM_HASH = "53e2dd2e86855bd54a86d4ded9f18016552e8a8fe682dab4c5a90b854c1da2ed75c97c74b5dada80e2a37e258ba5e2bb0ebd25c1190350cf94e5b55a7ceed244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-registration \
python3.13dist-django-registration \
python313-django-registration \
python3dist-django-registration"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-confusable-homoglyphs"

inherit rpm
