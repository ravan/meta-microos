SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-postgresql-3.0.5-2.2.noarch.rpm"
RPM_HASH = "ec5a36fde2dead5d862811bd09fa4c28a599f6a6359b3ef26bfc9fd40295c698c0270cdc0baf3fd7c6841283cc2c9a51db8eca27a168739762546591a5216d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-postgresql"

RDEPENDS:${PN} += "python314-SQLAlchemy \
python314-pandas \
python314-psycopg2"

inherit rpm
