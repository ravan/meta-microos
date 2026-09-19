SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python314-pytzdata-2020.1-3.14.noarch.rpm"
RPM_HASH = "fc239e222e193288987d2290e4b6676be22b48df7bb6da2b4aba0846a547e25223a5bf2d4d477eedbce01d7515e0be2b40b8c086a557d81fcf4243ed7769bcc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytzdata \
python314-pytzdata \
python3dist-pytzdata"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
