SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "python313-django-storages-1.14.6-1.4.noarch.rpm"
RPM_HASH = "5a1b0de913ce858f2f56f68183528ac1b0997ff28a08435f5e59efe63e894167a05de6a5f9f53ddd6268ab5013e005441832d7b93346ef6cd409e898c4dd1819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-storages \
python3.13dist-django-storages \
python313-django-storages \
python3dist-django-storages"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
