SUMMARY = "Client and Validator of OpenAPI 3 Specifications"
DESCRIPTION = "Client and Validator of OpenAPI 3 Specifications"
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python314-openapi3-1.8.2-1.4.noarch.rpm"
RPM_HASH = "2aedee54d4b2309ef0ce752f3f68a147ddfce7bf5aa530a4b0688d795f01fafceece00ff117a9081c4888ccf5284de90ad6f008bc23ce6826b5c16a4a4235a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openapi3 \
python314-openapi3 \
python3dist-openapi3"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-requests"

inherit rpm
