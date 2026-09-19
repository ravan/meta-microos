SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.14"

RPM_NAME = "python314-django-webtest-1.9.14-1.3.noarch.rpm"
RPM_HASH = "a3c83f621c7dd80e65bfc4fc2585fb25753442a453cabcad1b249cd832297bacb94dff5ea25832e02bd85db23824010d4ac348c725f2c77e5437242b9bc5d390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-webtest \
python314-django-webtest \
python3dist-django-webtest"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-WebTest"

inherit rpm
