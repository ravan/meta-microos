SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python313-six-1.17.0-2.1.noarch.rpm"
RPM_HASH = "56ef8e0e65afb363a508f690cea967c09388cc5be8fd77926233de63f6b031ac3e789e0fcb82976d64c5627d5acb4a10f7b4d81a70340563d668a3a18de81728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-six \
python3.13dist-six \
python313-six \
python3dist-six"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
