SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-pymongo-2.14.0-2.3.noarch.rpm"
RPM_HASH = "de35ad2115362fa172e9d8b635801bae2a71806cbbc175e8d75c13890328c61e3b70f382443343846fd7605995775e875eab9f109d4e8d9171015e881826d6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-pymongo"

RDEPENDS:${PN} += "python-abi \
python314-aws-xray-sdk \
python314-pymongo"

inherit rpm
