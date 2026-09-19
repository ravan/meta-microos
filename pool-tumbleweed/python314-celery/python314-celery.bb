SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.6.3"

RPM_NAME = "python314-celery-5.6.3-3.1.noarch.rpm"
RPM_HASH = "cd652273c1f819012b46adc428369ea1cd2e6aec20e8b816ddd4ce1932404f6f96e521f4a2e62736f283e083748e6ebfea30c26a08a0d9b4b9bb28d964d63f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-celery \
python314-celery \
python3dist-celery"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-billiard \
python314-click \
python314-click-didyoumean \
python314-click-plugins \
python314-click-repl \
python314-dbm \
python314-kombu \
python314-python-dateutil \
python314-tzlocal \
python314-vine"

inherit rpm
