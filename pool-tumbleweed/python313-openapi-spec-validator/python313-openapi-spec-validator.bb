SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python313-openapi-spec-validator-0.9.0-1.1.noarch.rpm"
RPM_HASH = "bc6f5fee5f421097de67aac221fcffa61c5bce2f5d4fb59fd86cf1a71ca65055a88f0ce7e711dfcc7240c589f5fe0dde6e606d2e541ed7888985be12bbadb123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-spec-validator \
python3.13dist-openapi-spec-validator \
python313-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python313-jsonschema >= 4.24 with python313-jsonschema < 5 \
-python313-jsonschema-path >= 0.5.0 with python313-jsonschema-path < 0.6 \
-python313-lazy-object-proxy >= 1.7.1 with python313-lazy-object-proxy < 2 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-openapi-schema-validator \
python313-pydantic \
python313-pydantic-settings \
update-alternatives"

inherit rpm
