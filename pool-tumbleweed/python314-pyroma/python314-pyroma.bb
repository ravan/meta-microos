SUMMARY = "Test a Python project's adherence to packaging guidelines"
DESCRIPTION = "Pyroma is a package that gives a rating of how well a Python project \
complies with the best practices of the Python packaging ecosystem, \
primarily PyPI, pip, Distribute, etc., as well as a list of issues \
that could be improved. \
 \
It's written so that there are a library with methods to call from Python, as \
well as a script, also called pyroma."
LICENSE = "MIT"

PV = "4.2"

RPM_NAME = "python314-pyroma-4.2-1.10.noarch.rpm"
RPM_HASH = "61870bcb1f971d902b6785972021e2145fcf49ddef1baf0c5cf364a9aa395e593862b0ec40e78a3c54d2a969fc32ad03319ddbe71809b52f802652d8e04ecee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyroma \
python314-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pygments \
python314-build \
python314-docutils \
python314-packaging \
python314-requests \
python314-setuptools \
python314-trove-classifiers \
update-alternatives"

inherit rpm
