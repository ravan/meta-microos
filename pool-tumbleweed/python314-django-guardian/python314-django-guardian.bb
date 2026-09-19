SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-2-Clause"

PV = "3.3.4"

RPM_NAME = "python314-django-guardian-3.3.4-1.1.noarch.rpm"
RPM_HASH = "3e1bd45307ce6f0de144b9087ad4a2ce1a3a08d69459930ac88a675415248160f4092baceae37ff499e48775a806f93fd2c6017ce24e7234383843925ab7a2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-guardian \
python314-django-guardian \
python3dist-django-guardian"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-typing-extensions"

inherit rpm
