SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-all-4.1.0-1.1.noarch.rpm"
RPM_HASH = "97d25709d9f205a472503a8166948fdb04e6acc00daac6fad53ed3a8b70b20e4cd736dc8f0c38d1e84f7d24bac1722eebd4494c99270a7b5dde498512f6bb096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-all \
python310-moto-all"

RDEPENDS:${PN} += "python310-PyYAML \
python310-aws-xray-sdk \
python310-cfn-lint \
python310-docker \
python310-graphql-core \
python310-idna \
python310-jsondiff \
python310-moto \
python310-openapi-spec-validator \
python310-pyparsing \
python310-python-jose \
python310-setuptools \
python310-sshpubkeys"

inherit rpm
