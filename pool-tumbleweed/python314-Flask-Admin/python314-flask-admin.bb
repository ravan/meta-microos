SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python314-Flask-Admin-2.2.0-1.2.noarch.rpm"
RPM_HASH = "a25ae5d808f1e594ef9121f734fc1b8376e94051780eb727f4fcc95b99039a5f4f07d9d4f8fe91eac9d555fb102a03deaac26fd3294b291b0a84ede084f9f74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-admin \
python314-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Jinja2 \
python314-MarkupSafe \
python314-SQLAlchemy \
python314-WTForms \
python314-Werkzeug"

inherit rpm
