SUMMARY = "Anysqlite provides an async/await interface to the standard sqlite3 library"
DESCRIPTION = "Anysqlite provides an `async/await` interface to the standard \
`sqlite3` library and supports both `trio` and `asyncio` backends \
using the power of Anyio."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "python314-anysqlite-0.0.5-1.5.noarch.rpm"
RPM_HASH = "ab5815ce0f201b32ad91b355c91ab0e614162a7178029d433af2b92d8cc4df3e642e42d4307f444855c9050ac9da2f2b88bcb221ce823a2d8193480a1094dad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anysqlite \
python314-anysqlite \
python3dist-anysqlite"

RDEPENDS:${PN} += "python-abi \
python314-anyio"

inherit rpm
