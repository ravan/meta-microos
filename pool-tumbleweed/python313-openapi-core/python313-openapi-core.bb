SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.23.1+git55"

RPM_NAME = "python313-openapi-core-0.23.1+git55-1.1.noarch.rpm"
RPM_HASH = "3d4ae4000feaf0c0833056692ce164d4814ba403f5834c56488ded14b3798c74e145cfd5010dcd12244c66a8efd38ccc44d981f6494794803e377bd620ed1b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-core \
python3.13dist-openapi-core \
python313-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python313-jsonschema >= 4.23.0 with python313-jsonschema < 5 \
-python313-jsonschema-path >= 0.5.0 with python313-jsonschema-path < 1 \
-python313-openapi-schema-validator >= 0.9 with python313-openapi-schema-validator < 0.10 \
-python313-openapi-spec-validator >= 0.9 with python313-openapi-spec-validator < 0.10 \
python-abi \
python313-Werkzeug \
python313-asgiref \
python313-isodate \
python313-more-itertools \
python313-parse"

inherit rpm
