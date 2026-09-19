SUMMARY = "Easy rate-limiting for python requests"
DESCRIPTION = "This package is a simple wrapper around pyrate-limiter that adds convenient integration with the requests library."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-requests-ratelimiter-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "f451b42928cb2b206e89753fad76ae4971e73b127b25fd3ab75f9d5e953f1fee49092a5bbb9c10cf3eab6bd932bc9b3ee7abc38c2ba07dedeb6b7d03cfd533bf"

RPROVIDES:${PN} += "python3-requests-ratelimiter \
python3.13dist-requests-ratelimiter \
python313-requests-ratelimiter \
python3dist-requests-ratelimiter"

RDEPENDS:${PN} += "-python313-pyrate-limiter >= 4.1 and python313-pyrate-limiter < 5 \
python-abi \
python313-requests"

inherit rpm
