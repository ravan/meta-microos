SUMMARY = "Easy rate-limiting for python requests"
DESCRIPTION = "This package is a simple wrapper around pyrate-limiter that adds convenient integration with the requests library."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-requests-ratelimiter-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "010d71037d2477187fba62aa7bc11473da279376bac22d6ee322437c43f41c1fa3b57a6ca6700ce80b8f59a1dbc6748738756d4cd15c15e842a7b301b30bcd0f"

RPROVIDES:${PN} += "python3.14dist-requests-ratelimiter \
python314-requests-ratelimiter \
python3dist-requests-ratelimiter"

RDEPENDS:${PN} += "-python314-pyrate-limiter >= 4.1 and python314-pyrate-limiter < 5 \
python-abi \
python314-requests"

inherit rpm
