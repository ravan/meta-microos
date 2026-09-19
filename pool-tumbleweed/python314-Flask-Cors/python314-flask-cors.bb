SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python314-Flask-Cors-6.0.2-1.2.noarch.rpm"
RPM_HASH = "f494672dd9d4dd4d82dc6951199541e06e48616f427d211db8d5aaba43cd9b4cf59f15ef22323d97adf217e2e067575ccc9d046ee6b46aec95e9dba97a553efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-cors \
python314-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Werkzeug"

inherit rpm
