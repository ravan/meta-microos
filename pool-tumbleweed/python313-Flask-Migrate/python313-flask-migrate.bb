SUMMARY = "SQLAlchemy database migrations for Flask applications using Alembic"
DESCRIPTION = "Flask-Migrate is an extension that handles SQLAlchemy database migrations \
for Flask applications using Alembic. The database operations are provided \
as command line arguments for Flask-Script."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-Flask-Migrate-4.1.0-1.3.noarch.rpm"
RPM_HASH = "b5ce6d90d69a948cc537e5c52e60b8256726a39841018a71f93c2cf0db8c7f45568fd83cedd330c6dd5a2020ed12662bd03f046a36d70ece4240d78c6e14014d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Migrate \
python3.13dist-flask-migrate \
python313-Flask-Migrate \
python3dist-flask-migrate"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Flask-SQLAlchemy \
python313-alembic"

inherit rpm
