SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "MIT"

PV = "3.29.7"

RPM_NAME = "python314-filelock-3.29.7-1.1.noarch.rpm"
RPM_HASH = "729c7661baa9ed7817ad58c0d5a5af7f35bea6d33ff9b0d7510dbbae222eb1e233f7e3b84f23e1525c5d918e69d433db11aa2b47ecf070fd9984931e09ae0f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-filelock \
python314-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi \
python314-asyncio \
python314-sqlite3"

inherit rpm
