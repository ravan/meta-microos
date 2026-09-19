SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.5.17.3"

RPM_NAME = "python314-pymisp-2.5.17.3-1.4.noarch.rpm"
RPM_HASH = "05ac25181d9f159b509bf9b5bf9fe59943ccbd10157a7206ad1fea738db36d0ecb4b68c57d2930ed9aee69e34436981f6d03e677e14e213c1e430ac7c651f9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymisp \
python314-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python3.14dist-deprecated \
python3.14dist-python-dateutil \
python3.14dist-requests \
python314-Deprecated \
python314-python-dateutil \
python314-requests"

inherit rpm
