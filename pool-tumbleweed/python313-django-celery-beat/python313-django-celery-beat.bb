SUMMARY = "Database-backed Periodic Tasks"
DESCRIPTION = "Database-backed Periodic Tasks."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "python313-django-celery-beat-2.9.0-1.2.noarch.rpm"
RPM_HASH = "12c7055df290535e924a3ac6455301860e86c46f361db1a3922e6a4a2e1dfa63db90c7342803d8fb7d18ec408a8941d00582086cc166f944f7a46d397044418c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-celery-beat \
python3.13dist-django-celery-beat \
python313-django-celery-beat \
python3dist-django-celery-beat"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-celery \
python313-cron-descriptor \
python313-django-timezone-field \
python313-python-crontab \
python313-tzdata"

inherit rpm
