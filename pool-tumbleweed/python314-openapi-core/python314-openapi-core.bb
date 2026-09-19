SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.23.1+git55"

RPM_NAME = "python314-openapi-core-0.23.1+git55-1.1.noarch.rpm"
RPM_HASH = "612a3844725f56bb7aae38ae251dd6af20367ea0fa5e399cdcfe887f7f48d73532528f98bff694a6f1d620801d7da1ddaa4874b07b32c503a09ad9d2ad9daa26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openapi-core \
python314-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python314-jsonschema >= 4.23.0 with python314-jsonschema < 5 \
-python314-jsonschema-path >= 0.5.0 with python314-jsonschema-path < 1 \
-python314-openapi-schema-validator >= 0.9 with python314-openapi-schema-validator < 0.10 \
-python314-openapi-spec-validator >= 0.9 with python314-openapi-spec-validator < 0.10 \
python-abi \
python314-Werkzeug \
python314-asgiref \
python314-isodate \
python314-more-itertools \
python314-parse"

inherit rpm
