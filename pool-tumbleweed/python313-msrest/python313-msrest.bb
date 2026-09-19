SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-msrest-0.7.1-3.9.noarch.rpm"
RPM_HASH = "24839cadb7d605a54045918c419910986afcde537cf81cabfd1c133e105ac17338fe48399522029a02539b25287ffefce7f8b641aa81a78c2fbf9af04f07bb84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msrest \
python3.13dist-msrest \
python313-msrest \
python3dist-msrest"

RDEPENDS:${PN} += "-python313-requests >= 2.16 with python313-requests < 3.00 \
python-abi \
python313-azure-core \
python313-certifi \
python313-isodate \
python313-requests-oauthlib"

inherit rpm
