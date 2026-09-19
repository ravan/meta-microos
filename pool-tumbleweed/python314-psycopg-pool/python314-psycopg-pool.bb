SUMMARY = "Connection Pool for Psycopg"
DESCRIPTION = "Connection Pool for Psycopg"
LICENSE = "LGPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "python314-psycopg-pool-3.3.0-1.4.noarch.rpm"
RPM_HASH = "0dedc50f92299f1650e31e10043be2e8b97f8fdc7b7fb438a00c91eac2a17d880e31520bf188d8b9173e55f7f34da10bdec0dd332291bcd2ab2d40f3f778bf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-psycopg-pool \
python314-psycopg-pool \
python3dist-psycopg-pool"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
