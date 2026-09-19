SUMMARY = "Provides job scheduling capabilities to RQ (Redis Queue)"
DESCRIPTION = "Provides job scheduling capabilities to RQ (Redis Queue)"
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python314-rq-scheduler-0.14-3.4.noarch.rpm"
RPM_HASH = "a90772d59e9b22ab98465c46464584e40179b850b25d68e7e591b988d3da5aac67849224b6d38f9cf64b1d181ad719abbfd15a18d0a0cbf84dd9d948cc0ffe58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rq-scheduler \
python314-rq-scheduler \
python3dist-rq-scheduler"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-crontab \
python314-freezegun \
python314-python-dateutil \
python314-rq \
update-alternatives"

inherit rpm
