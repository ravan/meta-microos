SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python313-Flask-Mailman-1.1.1-1.2.noarch.rpm"
RPM_HASH = "f7fc0b1bb7bb24a79e59ff3971148a5aef6dc4aed53be102390bfbf995fe0f1ebb0b00e721cfce14787ca19df07b3368ddedcadd7aefaa119261fd0344be91d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Mailman \
python3.13dist-flask-mailman \
python313-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python313-Flask"

inherit rpm
