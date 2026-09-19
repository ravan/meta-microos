SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.2"

RPM_NAME = "python314-django-cacheops-7.2-4.1.noarch.rpm"
RPM_HASH = "028eb845b031098e641eac0d17a1369bf67aec6b25c94ec4328104489d36282ca2e7379a19cff517eb7689210e17a41d36cc1571e2b8906b0062083d84d28e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-cacheops \
python314-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-funcy \
python314-redis"

inherit rpm
