SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python314-openapi-schema-validator-0.9.0-1.2.noarch.rpm"
RPM_HASH = "3d5389ddf0e06c1285443a4d5f996f2bf4c03961f66eec9cfa4127a33e0fc6a4c056ee3c73b910587825251b8d847f29ac81485931c8c08bc4df2d10d09d331d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openapi-schema-validator \
python314-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python314-jsonschema >= 4.19.1 with python314-jsonschema < 5 \
python-abi \
python314-jsonschema-specifications \
python314-pydantic \
python314-pydantic-settings \
python314-rfc3339-validator"

inherit rpm
