SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.42.1"

RPM_NAME = "python314-SQLAlchemy-Utils-0.42.1-1.3.noarch.rpm"
RPM_HASH = "0088d40a962931046a5dbd6460b1cc40e11137760e14e9750eadb67f9dfff3bea4acc663004716909bdebda34e7ad8a91d31abd1274883eb1e883311ae16664e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlalchemy-utils \
python314-SQLAlchemy-Utils \
python3dist-sqlalchemy-utils"

RDEPENDS:${PN} += "python-abi \
python314-SQLAlchemy"

inherit rpm
