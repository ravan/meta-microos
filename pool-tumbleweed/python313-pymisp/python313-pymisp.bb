SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.5.17.3"

RPM_NAME = "python313-pymisp-2.5.17.3-1.4.noarch.rpm"
RPM_HASH = "75c567f3a61dd19ec54ab4f08cdcff317f04476ad0b9ed7271bd4ff91d796eeeb5cec7e35ff5f4008062cdd34879f5d6f4faf7a10d6c1c29760765bba848d771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymisp \
python3.13dist-pymisp \
python313-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python3.13dist-deprecated \
python3.13dist-python-dateutil \
python3.13dist-requests \
python313-Deprecated \
python313-python-dateutil \
python313-requests"

inherit rpm
