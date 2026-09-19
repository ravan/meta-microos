SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python38-moto-all-4.1.0-1.1.noarch.rpm"
RPM_HASH = "5b3ecd49d7732c18f34219a83533d49ecd15d889530d23fafd9bbb3d4e4d1f81a6d452531bd14a866df4c6db503198f6a8bfdaba311e3dbc9d8443bae78565b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python38-moto-all"

RDEPENDS:${PN} += "python38-PyYAML \
python38-aws-xray-sdk \
python38-cfn-lint \
python38-docker \
python38-graphql-core \
python38-idna \
python38-jsondiff \
python38-moto \
python38-openapi-spec-validator \
python38-pyparsing \
python38-python-jose \
python38-setuptools \
python38-sshpubkeys"

inherit rpm
