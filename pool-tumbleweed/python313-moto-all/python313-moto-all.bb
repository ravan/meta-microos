SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install the extras moto[all], and \
moto[proxy], which have the same requirement definitions."
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python313-moto-all-5.2.1-1.2.noarch.rpm"
RPM_HASH = "15d241d3d043642126cd2bed69809d6358580a8df2d708279c99ba1679124ef8f84b21fd5753091a7db9b21cf3e19ecc29dc37ecfd96822deb8e2db5cb12d347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-all \
python3-moto-proxy \
python313-moto-all \
python313-moto-proxy"

RDEPENDS:${PN} += "python313-PyYAML \
python313-aws-xray-sdk \
python313-cfn-lint \
python313-docker \
python313-ecdsa \
python313-graphql-core \
python313-joserfc \
python313-jsondiff \
python313-moto \
python313-openapi-spec-validator \
python313-py-partiql-parser \
python313-pyparsing \
python313-python-multipart \
python313-setuptools"

inherit rpm
