SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-pydicom-data-1.0.0-3.8.noarch.rpm"
RPM_HASH = "958bdb9de66f4f43e7ad9c58d64cabeb5d2ef54b7cc33448e2b11e3457b58bcf13d9607c5bd1fe307f02e34995bfaaf3f153dcf84e7b8d3ccd1cc396f0d42284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydicom-data \
python314-pydicom-data \
python3dist-pydicom-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
