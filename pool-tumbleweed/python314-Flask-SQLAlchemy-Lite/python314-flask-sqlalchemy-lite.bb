SUMMARY = "Integrate SQLAlchemy with Flask"
DESCRIPTION = "Integrate SQLAlchemy with Flask. Use Flask's config to define SQLAlchemy \
database engines. Create SQLAlchemy ORM sessions that are cleaned up \
automatically after requests. \
 \
Intended to be a replacement for Flask-SQLAlchemy. Unlike the prior extension, \
this one does not attempt to manage the model base class, tables, metadata, or \
multiple binds for sessions. This makes the extension much simpler, letting the \
developer use standard SQLAlchemy instead."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-Flask-SQLAlchemy-Lite-0.2.1-1.2.noarch.rpm"
RPM_HASH = "53ae35c93283d5058d617ce132a8dc06f205f1f29b4323908f8cb67b07f7f19625502296c4b1f13528735f8ed00bd3451e934f2ff493912eea5ecacc46d902c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-sqlalchemy-lite \
python314-Flask-SQLAlchemy-Lite \
python314-flask-sqlalchemy-lite \
python3dist-flask-sqlalchemy-lite"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-SQLAlchemy \
python314-asgiref \
python314-greenlet"

inherit rpm
