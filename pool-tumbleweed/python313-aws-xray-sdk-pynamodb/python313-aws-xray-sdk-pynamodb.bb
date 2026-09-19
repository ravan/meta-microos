SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-pynamodb-2.14.0-2.3.noarch.rpm"
RPM_HASH = "f305d3bfe5e98172e463d652c7c8107a6bf750b0d06d7271a19be9e8d29796e7669da64f02778f546e85dba6f192d813ef0465d1bfc3bda9cdf8665edb04497d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pynamodb \
python313-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python313-aws-xray-sdk \
python313-pynamodb"

inherit rpm
