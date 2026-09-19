SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-Flask-WTF-1.3.0-1.2.noarch.rpm"
RPM_HASH = "8b1d04a46da7481a724ccadb89606a8a3f8630caff394d298b1ccca071b0dc4e455e8f0d070bd9d5baef61b72bf0f4d5a18b24cd56847c14bb99cf12c300254a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-wtf \
python314-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-WTForms \
python314-Werkzeug \
python314-itsdangerous"

inherit rpm
