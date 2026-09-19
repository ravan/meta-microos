SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "5.2.1"

RPM_NAME = "python314-django-registration-5.2.1-1.3.noarch.rpm"
RPM_HASH = "72cb883e6163a029775dd8d95ac665b5ba2773bb9a16f59942aadff4fa6f95147fc0e35b8bed4f1af5fe77df026c88ac70a0df60eb1d2ecd832324888fcabc16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-registration \
python314-django-registration \
python3dist-django-registration"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-confusable-homoglyphs"

inherit rpm
