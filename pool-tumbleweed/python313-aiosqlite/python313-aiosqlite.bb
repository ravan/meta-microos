SUMMARY = "AsyncIO Bridge to the Standard Python sqlite3 Module"
DESCRIPTION = "aiosqlite replicates the standard sqlite3 module, but with async versions of all \
the standard connection and cursor methods, and context managers for \
automatically closing connections."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python313-aiosqlite-0.22.1-1.2.noarch.rpm"
RPM_HASH = "c46ba17a53e10a38c9c64efd6bec4c655fd4bbee5df66dc1741f16bd86696811c0c1a22c451fa4700f62b860923bb8597837a4bc699e5a84c5b4fbca949740c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosqlite \
python3.13dist-aiosqlite \
python313-aiosqlite \
python3dist-aiosqlite"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
