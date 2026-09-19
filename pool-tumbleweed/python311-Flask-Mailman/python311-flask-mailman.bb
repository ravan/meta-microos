SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-Flask-Mailman-1.0.0-1.10.noarch.rpm"
RPM_HASH = "98affc3dd67056882c2768a2b4957e3a3caed75aa4c5f73a98f7dcf41ac4087f4ae6d1b075c04cae488111df5338e929a62c8f07f29541b045fd6ea9824fa94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-mailman \
python311-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm
