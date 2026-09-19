SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-sql-other-3.0.5-2.2.noarch.rpm"
RPM_HASH = "b05a1791690defb34de0fcf968b52a827ae28d278f88dadf73d56d3e680df1995ca388b0751260a80fc59479a7b4a574b6271aac79e14d4836aa2c92425a09b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-sql-other \
python313-pandas-sql-other"

RDEPENDS:${PN} += "python313-SQLAlchemy \
python313-pandas"

inherit rpm
