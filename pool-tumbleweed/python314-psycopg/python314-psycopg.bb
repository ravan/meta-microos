SUMMARY = "PostgreSQL database adapter for Python"
DESCRIPTION = "PostgreSQL database adapter for Python"
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python314-psycopg-3.3.4-2.1.noarch.rpm"
RPM_HASH = "e9409e3deaa7e3bb7d620b782f54e200d0764544a6509e7e6d8c73b49e5049620176e921bbab0092c7eff1d5182e67c5cd96b3f19d7a0d96665e80067095f67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-psycopg \
python314-psycopg \
python3dist-psycopg"

RDEPENDS:${PN} += "python-abi \
python314-psycopg-c \
python314-typing-extensions"

inherit rpm
