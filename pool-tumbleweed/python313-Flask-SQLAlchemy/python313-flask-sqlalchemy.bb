SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python313-Flask-SQLAlchemy-3.1.1-5.9.noarch.rpm"
RPM_HASH = "1a73e8323ef29314fc0701d0ddd01c2b5683801d35664677f81bd44e55ef707b3648eb7bc14c16cdf5efa9dddd719c9a6486ea312051132d789742ca75d24785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SQLAlchemy \
python3.13dist-flask-sqlalchemy \
python313-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-SQLAlchemy"

inherit rpm
