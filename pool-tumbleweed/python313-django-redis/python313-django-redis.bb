SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "python313-django-redis-7.0.0-1.2.noarch.rpm"
RPM_HASH = "9e80b254eec53680112f941dce8e413b1e971131bd6ba55e4819b84a77dc69e52e5da96448dd29080bec9b6c931a99db2ba7eea616bad36f617999f4fb8182ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-redis \
python3.13dist-django-redis \
python313-django-redis \
python3dist-django-redis"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-redis"

inherit rpm
