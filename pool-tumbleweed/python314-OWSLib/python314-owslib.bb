SUMMARY = "Python interface to OGC Web Services"
DESCRIPTION = "OWSLib is a Python package for client programming with Open Geospatial \
Consortium (OGC) web service (hence OWS) interface standards, and their \
related content models."
LICENSE = "BSD-3-Clause"

PV = "0.36.0"

RPM_NAME = "python314-OWSLib-0.36.0-1.1.noarch.rpm"
RPM_HASH = "9c218ba73451a8c2893ee15a22d4f5ce5881abebdf7c8aceb024a5ea72f5dec14bfa68f8abd6076dac93462f2c671ac0ce29840ff809ca7477b31b7cf903f054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-owslib \
python314-OWSLib \
python314-owslib \
python3dist-owslib"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-lxml \
python314-python-dateutil \
python314-requests"

inherit rpm
