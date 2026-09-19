SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python314-aiosqlite-0.22.1-1.2.noarch.rpm"
RPM_HASH = "a6d92dad8a973255f5d6ced8bc077d1db9a0e6b18e8275198aca805a37574d48a81b74258b08eefcc04e3bd6ec8f33e524269459f0d7f1bb29fc92576eb99736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiosqlite \
python314-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
