SUMMARY = "SQLAlchemy dialect integrated into Cloud Spanner database"
DESCRIPTION = "Spanner dialect for SQLAlchemy represents an interface API designed to make it \
possible to control Cloud Spanner databases with SQLAlchemy API."
LICENSE = "Apache-2.0"

PV = "1.17.3"

RPM_NAME = "python314-SQLAlchemy-spanner-1.17.3-1.2.noarch.rpm"
RPM_HASH = "aad4c96ac52eb7b7e4ed4c32d8d258f8252a7a7f8767273e510905c8ad23ea1d124edf6259d9d708232960aa86265fb63efb69fe7555565177dd64e3f438a403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlalchemy-spanner \
python314-SQLAlchemy-spanner \
python314-sqlalchemy-spanner \
python3dist-sqlalchemy-spanner"

RDEPENDS:${PN} += "python-abi \
python314-alembic \
python314-google-cloud-spanner"

inherit rpm
