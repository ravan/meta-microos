SUMMARY = "SQLAlchemy dialect integrated into Cloud Spanner database"
DESCRIPTION = "Spanner dialect for SQLAlchemy represents an interface API designed to make it \
possible to control Cloud Spanner databases with SQLAlchemy API."
LICENSE = "Apache-2.0"

PV = "1.17.3"

RPM_NAME = "python313-SQLAlchemy-spanner-1.17.3-1.2.noarch.rpm"
RPM_HASH = "652b64ccc7b8abef6ad06f45eda1f3c83c2fb79c946c61ae6ea252a09f5bac4b53eff4d28f211a26dd0195564ae8a1388923dabdca8b46cabef6f0f0cc02ec7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SQLAlchemy-spanner \
python3-sqlalchemy-spanner \
python3.13dist-sqlalchemy-spanner \
python313-SQLAlchemy-spanner \
python313-sqlalchemy-spanner \
python3dist-sqlalchemy-spanner"

RDEPENDS:${PN} += "python-abi \
python313-alembic \
python313-google-cloud-spanner"

inherit rpm
