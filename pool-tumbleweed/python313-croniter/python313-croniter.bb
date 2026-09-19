SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "6.2.4"

RPM_NAME = "python313-croniter-6.2.4-1.1.noarch.rpm"
RPM_HASH = "e6717cdd0d7bb368a8aa4b8f5c1e0cd81e0aeb2d4dc90d7b7afb25e28439f419e4a31f66a255b2f608bc1aeb002dd97046d0e2defac57361210e70fdb0d1101b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-croniter \
python3.13dist-croniter \
python313-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
