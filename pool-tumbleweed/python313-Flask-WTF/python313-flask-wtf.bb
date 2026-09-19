SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python313-Flask-WTF-1.3.0-1.2.noarch.rpm"
RPM_HASH = "c611534d1bf4071006a172f330f88e7d192d5d3b519f015066c1d3f7a6bcc252abf1a8f04ae7ac4d1a0882c3c8e5eb4b13f570d32107347c500851f552a03181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-WTF \
python3.13dist-flask-wtf \
python313-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-WTForms \
python313-Werkzeug \
python313-itsdangerous"

inherit rpm
