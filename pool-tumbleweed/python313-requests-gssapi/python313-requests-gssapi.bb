SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.4.0"

RPM_NAME = "python313-requests-gssapi-1.4.0-1.4.noarch.rpm"
RPM_HASH = "436f263bc6e4fe31c761b8801e757aa1a09cd5e918fd2e03e2ff57cd07e9424cd2aa3e48c6c7f6f5a28442c41ad7741bc820b4938dc13e56d2ea2e36cfeccaa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-gssapi \
python3.13dist-requests-gssapi \
python313-requests-gssapi \
python3dist-requests-gssapi"

RDEPENDS:${PN} += "python-abi \
python313-gssapi \
python313-requests"

inherit rpm
