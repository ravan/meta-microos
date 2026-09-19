SUMMARY = "Database-backed Periodic Tasks"
DESCRIPTION = "Database-backed Periodic Tasks."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "python314-django-celery-beat-2.9.0-1.2.noarch.rpm"
RPM_HASH = "ab6ac5920034a687e0782a6fbde8eb3b3957fed0f996c8d0207c49be835eabe42c9eb77c192e62b05948618f856259113671e8bb07c5ff800df3f438832fdca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-celery-beat \
python314-django-celery-beat \
python3dist-django-celery-beat"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-celery \
python314-cron-descriptor \
python314-django-timezone-field \
python314-python-crontab \
python314-tzdata"

inherit rpm
