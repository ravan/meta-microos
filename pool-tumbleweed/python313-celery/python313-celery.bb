SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.6.3"

RPM_NAME = "python313-celery-5.6.3-3.1.noarch.rpm"
RPM_HASH = "95783f148e03abb2138093c17e64f7f3531342f9ed7012cf66ee70448ea529b2669df84be1c9e590ea71a848c7e9d7edbb82f41a1ed03361943d0d71d57909ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery \
python3.13dist-celery \
python313-celery \
python3dist-celery"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-billiard \
python313-click \
python313-click-didyoumean \
python313-click-plugins \
python313-click-repl \
python313-dbm \
python313-kombu \
python313-python-dateutil \
python313-tzlocal \
python313-vine"

inherit rpm
