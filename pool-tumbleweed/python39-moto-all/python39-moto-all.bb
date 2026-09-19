SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-all-4.1.0-1.1.noarch.rpm"
RPM_HASH = "3e1234fe7ee2410763a0562326b3f23a0b6afd796b76ee0d1a2876c088f6210112b7d170620f067236b49fc70f9eb4d9f9e77ff8ac45315a913ed3d570e4cff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-all"

RDEPENDS:${PN} += "python39-PyYAML \
python39-aws-xray-sdk \
python39-cfn-lint \
python39-docker \
python39-graphql-core \
python39-idna \
python39-jsondiff \
python39-moto \
python39-openapi-spec-validator \
python39-pyparsing \
python39-python-jose \
python39-setuptools \
python39-sshpubkeys"

inherit rpm
