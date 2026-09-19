SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "6.2.4"

RPM_NAME = "python314-croniter-6.2.4-1.1.noarch.rpm"
RPM_HASH = "1e86476b1dc044321049c80b5b381c8eaa1401d58a6a60038b557c93aed85168d812f90f9e5f39611f157349b80d6419972e8af712a8ca6b06bd2fd9034e8a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-croniter \
python314-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
