SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.4"

RPM_NAME = "python314-swagger-spec-validator-3.0.4-1.8.noarch.rpm"
RPM_HASH = "50de4c8ab044ec5d815b8ae8ce2d09788d83fcaef0791b51ff69e43f4b5e7e3790db73f249757077516963de12f90c921295ad5cd42a86d3b26448c1081c05fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-swagger-spec-validator \
python314-swagger-spec-validator \
python3dist-swagger-spec-validator"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-jsonschema \
python314-typing-extensions"

inherit rpm
