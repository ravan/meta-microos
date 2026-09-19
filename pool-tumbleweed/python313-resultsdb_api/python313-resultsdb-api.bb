SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.6"

RPM_NAME = "python313-resultsdb_api-2.1.6-1.2.noarch.rpm"
RPM_HASH = "c652021edf6326a39720c31876971118d1101d8df1fbd416c13dff02cdf3ba3c3b5c7a6c1ac3c37ce414734a6ff91787b1a3b10245f8f774cee0b6faeff073d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resultsdb-api \
python3.13dist-resultsdb-api \
python313-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-simplejson"

inherit rpm
