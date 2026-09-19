SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "python314-django-storages-1.14.6-1.4.noarch.rpm"
RPM_HASH = "4a49c60cc8248a44f674e7f82a7dbb9a70d555e21031854a4e298eed8bcaa88e68eb306c2c4410ca2bdca8b22af730a3daee58b2f7ae33c9ecdb0be7fc3846d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-storages \
python314-django-storages \
python3dist-django-storages"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
