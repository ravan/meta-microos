SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-django-seed-0.3.1-2.7.noarch.rpm"
RPM_HASH = "9bf8d61c5e165d3ea9b90cf9d47057d3d7e3ee5a449522805b83a196730bd7b2a88b6b85f15d6e632feab458e275b1e26fcc94e6e55bb0d85d167d2db3ea8839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-seed \
python3.13dist-django-seed \
python313-django-seed \
python3dist-django-seed"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-Faker \
python313-toposort"

inherit rpm
