SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-Flask-Migrate-4.1.0-1.3.noarch.rpm"
RPM_HASH = "44932cabc4738cd8affc4c4226a7e01f1ee4fe9ac503aa2a7c47f5f44131157ed552bc6549041ae8c9c288591daa038bcd575fd156f5af9a65be5627aca324f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-migrate \
python314-Flask-Migrate \
python3dist-flask-migrate"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Flask-SQLAlchemy \
python314-alembic"

inherit rpm
