SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.8.0"

RPM_NAME = "python313-pynetbox-7.8.0-1.2.noarch.rpm"
RPM_HASH = "1b021647633b55e6d5476863230a33f4323fb1a7afd74d6e47d88ecd99b9f0eb3f1442bd7fbf03638bf0b96e2a128c9eb61a3c5ce2064dd84384608c0077447a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynetbox \
python3.13dist-pynetbox \
python313-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-requests \
python313-urllib3"

inherit rpm
