SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "2.10"

RPM_NAME = "python314-rq-2.10-1.2.noarch.rpm"
RPM_HASH = "5cadc5761e46491a0228ec956dc126fef34f987fcee6b4035733126bcf8ffd054835095bb460ac3a68f6dbb17518be9fefe1314b4e892f9e5ecd96b40bc34d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rq \
python314-rq \
python3dist-rq"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-croniter \
python314-redis \
update-alternatives"

inherit rpm
