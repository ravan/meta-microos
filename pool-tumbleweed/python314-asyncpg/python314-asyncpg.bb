SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.31.0"

RPM_NAME = "python314-asyncpg-0.31.0-1.3.aarch64.rpm"
RPM_HASH = "746e5a5c1de76d09d3a5f08279889112b09d845b2701e4b983e8a971bbecbdad042963cef85fcfdce79c7f014f9758de2fc5c71c5aff9f594dc924bea79e896d"

RPROVIDES:${PN} += "python3.14dist-asyncpg \
python314-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
