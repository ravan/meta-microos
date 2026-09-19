SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-sql-other-3.0.5-2.2.noarch.rpm"
RPM_HASH = "a3752cd07df32a77c2026940a32bb0968612a3103a6d9516dabef4a33bf4015313e9ed586747ddce0b4cde38e319f0f76dea135a3ff189813d6d0c6ca411f83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-sql-other"

RDEPENDS:${PN} += "python314-SQLAlchemy \
python314-pandas"

inherit rpm
