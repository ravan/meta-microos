SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.4"

RPM_NAME = "python313-swagger-spec-validator-3.0.4-1.8.noarch.rpm"
RPM_HASH = "b98413f70d1cca57a094fdb6af7399e1396943c469aab3c333ef583f3a577e053eea063628401877341bc506d374c34ed1b4b1e0be1449263e5528a5f4db7dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swagger-spec-validator \
python3.13dist-swagger-spec-validator \
python313-swagger-spec-validator \
python3dist-swagger-spec-validator"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-jsonschema \
python313-typing-extensions"

inherit rpm
