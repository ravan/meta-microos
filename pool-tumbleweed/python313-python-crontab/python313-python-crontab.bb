SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "python313-python-crontab-3.3.0-2.3.noarch.rpm"
RPM_HASH = "fca4674aac2b7370f67440039c2d93c05d48780475da6392712e1c48a1d4d5f6b2fdb9b168a03ae4e18daf9a1e3156e5c0bed27c76b7016139b6c0f39e0afa4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-crontab \
python3.13dist-python-crontab \
python313-python-crontab \
python3dist-python-crontab"

RDEPENDS:${PN} += "python-abi"

inherit rpm
