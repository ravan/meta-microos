SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.2"

RPM_NAME = "python313-django-cacheops-7.2-4.1.noarch.rpm"
RPM_HASH = "63eeaf0a927d530acef960bb5b68dc1f089a904d14bfe2c80096929a20444dd447b4ba3dd6eb0eb8a7eb54d134283ae6d8c7a4e8a1c5060b27565477ddb00488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cacheops \
python3.13dist-django-cacheops \
python313-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-funcy \
python313-redis"

inherit rpm
