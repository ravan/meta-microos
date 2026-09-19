SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.31.0"

RPM_NAME = "python313-asyncpg-0.31.0-1.3.aarch64.rpm"
RPM_HASH = "85c8627568ea5253be6c1838041d778438af39ee1713cc53ceea23783943eafabc518ef9c06e93d03dcb7dc708eec552592444c07c6859cfa694226987c6ccdd"

RPROVIDES:${PN} += "python3-asyncpg \
python3.13dist-asyncpg \
python313-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
