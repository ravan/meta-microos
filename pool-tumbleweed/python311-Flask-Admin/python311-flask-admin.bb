SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python311-Flask-Admin-1.6.1-4.4.noarch.rpm"
RPM_HASH = "cecb99916facf29753412a0efb3e6aae51e2b39ff3fda26af2037d22cdd3c2d6f46c22be6db2cc27567735ed1e430b6dbce18a4b034245e4ba3f08f14901969c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-admin \
python311-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-SQLAlchemy \
python311-WTForms"

inherit rpm
