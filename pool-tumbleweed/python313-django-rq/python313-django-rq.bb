SUMMARY = "Simple app that provides django integration for RQ (Redis Queue)"
DESCRIPTION = "Django integration with RQ, a Redis based Python queuing library. \
Django-RQ is a simple app that allows you to configure your queues \
in django's settings.py and easily use them in your project."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python313-django-rq-4.1.1-1.1.noarch.rpm"
RPM_HASH = "577acccc2ccbfddab7e4c7f28a6c6371fb87c24e8260dc18aa348321c21b62567f367408dcfb78199493705cc8fd18b3749494b508dd0fb7286ebb730ab14c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rq \
python3.13dist-django-rq \
python313-django-rq \
python3dist-django-rq"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-redis \
python313-rq"

inherit rpm
