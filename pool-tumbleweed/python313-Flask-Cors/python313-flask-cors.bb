SUMMARY = "A Flask extension adding a decorator for CORS support"
DESCRIPTION = "A Flask extension for handling Cross Origin Resource Sharing (CORS), \
making cross-origin AJAX possible."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python313-Flask-Cors-6.0.2-1.2.noarch.rpm"
RPM_HASH = "853d113911591a43bb72734ce6255b437f21545c94bc41645b9ba492582a177432c06df175baca6db03046173f5bad9629dec558fb975343f35076eb86af1698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Cors \
python3.13dist-flask-cors \
python313-Flask-Cors \
python3dist-flask-cors"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Werkzeug"

inherit rpm
