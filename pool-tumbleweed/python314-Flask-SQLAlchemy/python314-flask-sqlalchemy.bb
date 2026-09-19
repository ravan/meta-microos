SUMMARY = "SQLAlchemy support for Flask"
DESCRIPTION = "Adds SQLAlchemy support to your Flask application."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python314-Flask-SQLAlchemy-3.1.1-5.9.noarch.rpm"
RPM_HASH = "89293e5fd678ba70856484beb93560bb2ede5cb18325cc8cf913e4ac01648c6ab3c9c586091686c9fb2fa9e512e0f89a944369545c1f612dd165fcf358290c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-sqlalchemy \
python314-Flask-SQLAlchemy \
python3dist-flask-sqlalchemy"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-SQLAlchemy"

inherit rpm
