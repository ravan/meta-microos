SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python313-pytzdata-2020.1-3.14.noarch.rpm"
RPM_HASH = "b851edc729da1fa89e707ef201db45f5df2835bb255c00cfda4ea44157d7a459b001e2ffa99fc202f20eae9ba91cc44687595af1776151e91314ea12b52cdb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytzdata \
python3.13dist-pytzdata \
python313-pytzdata \
python3dist-pytzdata"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
