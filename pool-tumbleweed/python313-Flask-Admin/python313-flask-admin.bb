SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python313-Flask-Admin-2.2.0-1.2.noarch.rpm"
RPM_HASH = "c4c88c3b2f16f010ef4c041e08480bd539b1cafaa6d00727f8c670f856dcb6428173a3a891de4e8bf63edfb9a8dd2979bdcbf7e0e68c60cc03f3a84e551301d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Admin \
python3.13dist-flask-admin \
python313-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Jinja2 \
python313-MarkupSafe \
python313-SQLAlchemy \
python313-WTForms \
python313-Werkzeug"

inherit rpm
