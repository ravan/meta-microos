SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install the extras moto[all], and \
moto[proxy], which have the same requirement definitions."
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python314-moto-all-5.2.1-1.2.noarch.rpm"
RPM_HASH = "ca3695a7a4bba2a77ddce34f2b91c57b3f666ee1830bb7016972a735af7c2b21082264311cae6725066928961d7ba7d0296c71d07653b5158d29b4bee6d4cada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-moto-all \
python314-moto-proxy"

RDEPENDS:${PN} += "python314-PyYAML \
python314-aws-xray-sdk \
python314-cfn-lint \
python314-docker \
python314-ecdsa \
python314-graphql-core \
python314-joserfc \
python314-jsondiff \
python314-moto \
python314-openapi-spec-validator \
python314-py-partiql-parser \
python314-pyparsing \
python314-python-multipart \
python314-setuptools"

inherit rpm
