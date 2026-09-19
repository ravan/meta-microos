SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "9.4.2"

RPM_NAME = "python313-elastic-transport-9.4.2-2.1.noarch.rpm"
RPM_HASH = "59cac4b3b9cfade15128b4afa9eceb84ae418cd2e56e05b557df88f94f5c30c82d19a88375ff9a773e25949f27bad8bc1eb6e3bc5de02f184a15b4568a31243a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elastic-transport \
python3.13dist-elastic-transport \
python313-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-sniffio \
python313-urllib3"

inherit rpm
