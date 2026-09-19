SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-mock-open-1.4.0-3.12.noarch.rpm"
RPM_HASH = "01b59aa51eea9d75837c0d5ec156525a4461071a06c599d8c5da5d8812ac13f8f018d4d16f805252cd62a8eddd21bcce6b828f36881237436c4728bad4d3e781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mock-open \
python314-mock-open \
python3dist-mock-open"

RDEPENDS:${PN} += "python-abi"

inherit rpm
