SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "python314-django-redis-7.0.0-1.2.noarch.rpm"
RPM_HASH = "68d3ee9f87e9d73d120b306f7a0107c5ce448cb7cc2a2e7501122a4d4e98a3a78b6c176db64ce6732f83d863e452ff54b5ebcf064cd651eb65d0a7fff61e1017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-redis \
python314-django-redis \
python3dist-django-redis"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-redis"

inherit rpm
