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

RPM_NAME = "python313-Flask-SQLAlchemy-Lite-0.2.1-1.2.noarch.rpm"
RPM_HASH = "6cf729dd7e66238cea869832dc3cfd0e8ddf3daa037dbd20d8daa3f8394bf5bb393b994aab58eeda544333edcb88ad7b9a155e4f5712a66b6c8054eb9d6c0852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SQLAlchemy-Lite \
python3-flask-sqlalchemy-lite \
python3.13dist-flask-sqlalchemy-lite \
python313-Flask-SQLAlchemy-Lite \
python313-flask-sqlalchemy-lite \
python3dist-flask-sqlalchemy-lite"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-SQLAlchemy \
python313-asgiref \
python313-greenlet"

inherit rpm
