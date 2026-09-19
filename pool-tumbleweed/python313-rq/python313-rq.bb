SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "2.10"

RPM_NAME = "python313-rq-2.10-1.2.noarch.rpm"
RPM_HASH = "cecdf9b337ed237a5da8d9aa121d34665b6d583695c74461ba062154fbe214269f95874cb74b5ce31fb6422ddd9ad73afc315f08b48b5cee37ba74164401427a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rq \
python3.13dist-rq \
python313-rq \
python3dist-rq"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-croniter \
python313-redis \
update-alternatives"

inherit rpm
