SUMMARY = "Client and Validator of OpenAPI 3 Specifications"
DESCRIPTION = "Client and Validator of OpenAPI 3 Specifications"
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python313-openapi3-1.8.2-1.4.noarch.rpm"
RPM_HASH = "2e011975127e0ceea139c1c5d82087595a89c65affc750cdf5479ae2755bcc3c1119eba8e6c27f36fa16f90cf2e728522faf45b6be747301a3722a7672511251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi3 \
python3.13dist-openapi3 \
python313-openapi3 \
python3dist-openapi3"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-requests"

inherit rpm
