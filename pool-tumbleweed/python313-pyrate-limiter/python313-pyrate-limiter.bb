SUMMARY = "Python Rate-Limiter using Leaky-Bucket Algorithm Family"
DESCRIPTION = "A fast, async-friendly rate limiter for Python with pluggable algorithms and backends."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python313-pyrate-limiter-4.4.0-1.1.noarch.rpm"
RPM_HASH = "f9f9c83554ff920c3609d2329d031fb46463f7a5d68c97cba65aeaf85e6f323c45f617ff2956e7e26eaed38e0bfbdd9745d175e9c0f3593cdd11f0b251db7cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyrate-limiter \
python3.13dist-pyrate-limiter \
python313-pyrate-limiter \
python3dist-pyrate-limiter"

RDEPENDS:${PN} += "python-abi \
python313-filelock \
python313-psycopg \
python313-redis"

inherit rpm
