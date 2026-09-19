SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python314-Flask-Mailman-1.1.1-1.2.noarch.rpm"
RPM_HASH = "0192e0097d32ef8744e36d71b5a3ed68926718e717e6ac2bc9d79fe24026bad8180fecbe38c641fec6eeb9c4e23e7ea05518568536e6ac8157de25d9425b70da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-mailman \
python314-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python314-Flask"

inherit rpm
