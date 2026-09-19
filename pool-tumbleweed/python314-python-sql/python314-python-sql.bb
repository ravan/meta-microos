SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "python314-python-sql-1.8.1-1.3.noarch.rpm"
RPM_HASH = "84352f34f0a8c325748438fda96f15ac0bcfd39f2ae463fa214ea7600898b35fcf5ca9cd4467f40cca24bfed21dc1f501068cd077b2892ff29d97a3f130b0483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-sql \
python314-python-sql \
python3dist-python-sql"

RDEPENDS:${PN} += "python-abi \
python314-hatch-tryton"

inherit rpm
