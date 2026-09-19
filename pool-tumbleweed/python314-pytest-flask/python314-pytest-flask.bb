SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-pytest-flask-1.3.0-2.6.noarch.rpm"
RPM_HASH = "8202b926305354de84e1854017e99a411407636fe65a3c7815e02f797417eff538c2ec5e20b13ab74870293480f8b52e2aaccde850ee630423475630fa1b07a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-flask \
python314-pytest-flask \
python3dist-pytest-flask"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Werkzeug \
python314-pytest"

inherit rpm
