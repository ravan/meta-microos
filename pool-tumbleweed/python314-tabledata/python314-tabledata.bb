SUMMARY = "Python library to represent tabular data"
DESCRIPTION = "tabledata is a Python library to represent tabular data."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "python314-tabledata-1.3.5-1.2.noarch.rpm"
RPM_HASH = "f8bdf2a35fbabd9d1339978d299962a11afdfc6c85a434acdef8eab5c18b4be6634cd5690490413ab6932e0f44a50aee0928eebea7e3b486c3f1325b3f925812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tabledata \
python314-tabledata \
python3dist-tabledata"

RDEPENDS:${PN} += "python-abi \
python314-DataProperty \
python314-typepy"

inherit rpm
