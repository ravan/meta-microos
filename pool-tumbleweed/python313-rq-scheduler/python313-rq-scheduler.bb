SUMMARY = "Provides job scheduling capabilities to RQ (Redis Queue)"
DESCRIPTION = "Provides job scheduling capabilities to RQ (Redis Queue)"
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python313-rq-scheduler-0.14-3.4.noarch.rpm"
RPM_HASH = "46e05bbd4a0155ac3e13c0bc30408d0d619c8637618bfeb326785d45fbd949fb165f0e28b8592e770eb86a053728b841074e2d47702d8c82935e21c0bc7ff56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rq-scheduler \
python3.13dist-rq-scheduler \
python313-rq-scheduler \
python3dist-rq-scheduler"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-crontab \
python313-freezegun \
python313-python-dateutil \
python313-rq \
update-alternatives"

inherit rpm
