SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-postgresql-3.0.5-2.2.noarch.rpm"
RPM_HASH = "93a5bb455e21af875e2fdc71c3e943f88c5d9d2d044d011d8b691b255bb6620ec5f49048b613f22144b1f6902b883f0c6111c12006aed77510e03b30555f5623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-postgresql \
python313-pandas-postgresql"

RDEPENDS:${PN} += "python313-SQLAlchemy \
python313-pandas \
python313-psycopg2"

inherit rpm
