SUMMARY = "Extensible admin interface framework for Flask"
DESCRIPTION = "Flask-Admin is a Flask extension that lets the user add admin \
interfaces to Flask applications. \
 \
It is inspired by the django-admin Python package, though the \
developer has more control over the look, feel and functionality of \
the resulting application."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python312-Flask-Admin-1.6.1-4.4.noarch.rpm"
RPM_HASH = "363bb10980ccf260d916d4e30717d1798b27dca281c2243975f2f1012f3ce231dee4ea42ca9cb7309c240920317b89419fe063a7b0ef10cdf2aaaa005a914bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-flask-admin \
python312-Flask-Admin \
python3dist-flask-admin"

RDEPENDS:${PN} += "python-abi \
python312-Flask \
python312-SQLAlchemy \
python312-WTForms"

inherit rpm
