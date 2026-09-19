SUMMARY = "Python Rate-Limiter using Leaky-Bucket Algorithm Family"
DESCRIPTION = "A fast, async-friendly rate limiter for Python with pluggable algorithms and backends."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python314-pyrate-limiter-4.4.0-1.1.noarch.rpm"
RPM_HASH = "0def34b2694d125799863be2e584b5be6a75d8183d4ce4b7631edbc72c0fe449b5561cd530f242e1ed632dfbf42ec5c0aeaf367803022dba1d50c49816c38900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyrate-limiter \
python314-pyrate-limiter \
python3dist-pyrate-limiter"

RDEPENDS:${PN} += "python-abi \
python314-filelock \
python314-psycopg \
python314-redis"

inherit rpm
