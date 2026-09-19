SUMMARY = "Anysqlite provides an async/await interface to the standard sqlite3 library"
DESCRIPTION = "Anysqlite provides an `async/await` interface to the standard \
`sqlite3` library and supports both `trio` and `asyncio` backends \
using the power of Anyio."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "python313-anysqlite-0.0.5-1.5.noarch.rpm"
RPM_HASH = "1539c1abf3904d994feaa244d215f11f9829a0f2e16af728f973162e354c870952e6486f28273c1e2130736d238e3fa2c6e001d660af29dd37668157f5323ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anysqlite \
python3.13dist-anysqlite \
python313-anysqlite \
python3dist-anysqlite"

RDEPENDS:${PN} += "python-abi \
python313-anyio"

inherit rpm
