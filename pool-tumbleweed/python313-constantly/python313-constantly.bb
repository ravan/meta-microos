SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "23.10.4"

RPM_NAME = "python313-constantly-23.10.4-1.8.noarch.rpm"
RPM_HASH = "a1ad7f775d05949f8146fb08b3c72b2116cae8154b12a882137798294aa4aba376af9c751dab1b298c63bbb2ce79203fc6e172d7c6753fc62eaffd5890e0192a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-constantly \
python3.13dist-constantly \
python313-constantly \
python3dist-constantly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
