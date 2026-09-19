SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.6"

RPM_NAME = "python314-resultsdb_api-2.1.6-1.2.noarch.rpm"
RPM_HASH = "a42ab0c8d736d4c937acbabd59cb2045d039ae92b40d5efbde3dbb3fb04640c6276c9bdbd5dafaa1329e7470257b3b95b03ab10d8375a411f320fa69e24e2e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-resultsdb-api \
python314-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-simplejson"

inherit rpm
