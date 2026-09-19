SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "python314-python-utils-3.9.1-1.5.noarch.rpm"
RPM_HASH = "415df6744bb31c886c9f496f8e65b80dadf57db8656a249a11329462307e9783859e5be4e9c94dc31da1b5ff6977f3c1c68cea216bee8bf3e7c69e361c5580ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-utils \
python314-python-utils \
python3dist-python-utils"

RDEPENDS:${PN} += "python-abi \
python314-loguru \
python314-typing-extensions"

inherit rpm
