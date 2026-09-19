SUMMARY = "New time-based UUID formats which are suited for use as a database key"
DESCRIPTION = "New time-based UUID formats which are suited for use as a database key"
LICENSE = "MIT"

PV = "2025.0.1"

RPM_NAME = "python314-uuid6-2025.0.1-1.5.noarch.rpm"
RPM_HASH = "0ba86a165295eaab8eb0a796417bdc163f61ab1b31822e83a287074fc4765714ac5ddfb5274121ff383c5c7b8bc2270f346ecf41f1205013f460c9e896b99ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uuid6 \
python314-uuid6 \
python3dist-uuid6"

RDEPENDS:${PN} += "python-abi"

inherit rpm
