SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python313-openapi-schema-validator-0.9.0-1.2.noarch.rpm"
RPM_HASH = "74e5d86bdf4f704b3b3f97333ea62d485dee4072a2f29413a0ec38843674cede1f94f3a65512e55a56dc41129a12e9387963cd701c9247e097cf4183ea4a24b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-schema-validator \
python3.13dist-openapi-schema-validator \
python313-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python313-jsonschema >= 4.19.1 with python313-jsonschema < 5 \
python-abi \
python313-jsonschema-specifications \
python313-pydantic \
python313-pydantic-settings \
python313-rfc3339-validator"

inherit rpm
