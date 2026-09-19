SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.21"

RPM_NAME = "python314-selection-0.0.21-1.14.noarch.rpm"
RPM_HASH = "905d445fd281ef77e15b476a9804d5d1035c1559d1232309e69cc6113ca95dbe296527b5be1a8c9bea3575fac98badc839b554c4bd9bc00994e38e18c29549ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-selection \
python314-selection \
python3dist-selection"

RDEPENDS:${PN} += "python-abi \
python314-lxml"

inherit rpm
