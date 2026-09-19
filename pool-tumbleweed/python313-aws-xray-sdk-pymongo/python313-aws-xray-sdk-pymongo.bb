SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-pymongo-2.14.0-2.3.noarch.rpm"
RPM_HASH = "402921a0c3c5b38d68a1cff01a2fdc074cc09db588d80fb3f99a293f82a66efe6282ab439624e00ea2e6972d43b3c1b3275cb0fdfdd96009cea838798e14cdb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pymongo \
python313-aws-xray-sdk-pymongo"

RDEPENDS:${PN} += "python-abi \
python313-aws-xray-sdk \
python313-pymongo"

inherit rpm
