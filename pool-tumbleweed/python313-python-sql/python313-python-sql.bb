SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "python313-python-sql-1.8.1-1.3.noarch.rpm"
RPM_HASH = "25258ffc0a07af4193956c710ca0d295d4ff295123cb953cf2474c4796ee55daded871ac0882ea21940ecfdcdab614465e5ed0233b4323c8d06ee0aae1429376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-sql \
python3.13dist-python-sql \
python313-python-sql \
python3dist-python-sql"

RDEPENDS:${PN} += "python-abi \
python313-hatch-tryton"

inherit rpm
