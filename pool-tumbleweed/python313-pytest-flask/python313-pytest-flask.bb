SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-pytest-flask-1.3.0-2.6.noarch.rpm"
RPM_HASH = "6c390c9f074edcff6059d4c553ccfac4f8a6ab90c8a913786dd09360d4e4b3b2a5e8e734e589c87f14750f468dd0c29292a26b9e93bf43a802a832ad6775ea94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flask \
python3.13dist-pytest-flask \
python313-pytest-flask \
python3dist-pytest-flask"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Werkzeug \
python313-pytest"

inherit rpm
