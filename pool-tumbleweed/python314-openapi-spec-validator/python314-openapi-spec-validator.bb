SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python314-openapi-spec-validator-0.9.0-1.1.noarch.rpm"
RPM_HASH = "027bc0c30f2bf17e811670a52bdeeba80aaefa91e7f68f1ffdc86bd447388fcab38b083a44a0e35af8ba29fdace816a6a4a47c64b4d0b0ac2dd10569d774f9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openapi-spec-validator \
python314-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python314-jsonschema >= 4.24 with python314-jsonschema < 5 \
-python314-jsonschema-path >= 0.5.0 with python314-jsonschema-path < 0.6 \
-python314-lazy-object-proxy >= 1.7.1 with python314-lazy-object-proxy < 2 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-openapi-schema-validator \
python314-pydantic \
python314-pydantic-settings \
update-alternatives"

inherit rpm
