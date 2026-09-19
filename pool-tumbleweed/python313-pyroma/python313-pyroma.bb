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

RPM_NAME = "python313-pyroma-4.2-1.10.noarch.rpm"
RPM_HASH = "087f0408cfda8d7dc72063c89437c90ed3fc147194a7524f736a603856364d9eadd07d6da195350fe64a068e62f49703c12cb277ca0e886a31da134d724bd0a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyroma \
python3.13dist-pyroma \
python313-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pygments \
python313-build \
python313-docutils \
python313-packaging \
python313-requests \
python313-setuptools \
python313-trove-classifiers \
update-alternatives"

inherit rpm
