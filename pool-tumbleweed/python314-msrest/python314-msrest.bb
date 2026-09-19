SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-msrest-0.7.1-3.9.noarch.rpm"
RPM_HASH = "c221e5784336415de69185446877ed50eb19e59183938cf553735689f78076f6f7db6bb6074487b0ff6af5ebb67b6d67c3cf202c17d44ba1ff30e584c24a2612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msrest \
python314-msrest \
python3dist-msrest"

RDEPENDS:${PN} += "-python314-requests >= 2.16 with python314-requests < 3.00 \
python-abi \
python314-azure-core \
python314-certifi \
python314-isodate \
python314-requests-oauthlib"

inherit rpm
