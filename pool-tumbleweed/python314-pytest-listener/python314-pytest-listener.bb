SUMMARY = "A simple network listener for pytest"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pytest-listener-1.8.1-1.7.noarch.rpm"
RPM_HASH = "f43c8934c3e4f9d0858ec80a096d77bf2132528704046275c55aa75715493e0832d1b5df04f2778952eab2fc61e5d23bc8962332b4b63af3ba0ce4d527aea89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-listener \
python314-pytest-listener \
python3dist-pytest-listener"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-pytest-server-fixtures"

inherit rpm
