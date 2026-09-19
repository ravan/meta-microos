SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python313-PyRSS2Gen-1.1-3.5.noarch.rpm"
RPM_HASH = "e49abccccecfc5528e8ed897bf2a844dae8c6ec41ca31379ecfae4950bfa62e34a1f97743b595b43a1848785d1ceec7e13aecb23bbd568bd1e980c0a9680fbbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3-PyRSS2Gen \
python3.13dist-pyrss2gen \
python313-PyRSS2Gen \
python3dist-pyrss2gen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
