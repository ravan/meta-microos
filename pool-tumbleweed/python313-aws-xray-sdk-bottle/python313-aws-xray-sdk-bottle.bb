SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-bottle-2.14.0-2.3.noarch.rpm"
RPM_HASH = "c5ae80de0ed49963898843a922a85dbcf4629f420da5dc1b1f9251b404409e8b7759a3fc3478bd7adf2089cd52b4220192869cb3520fca5ad783938caa1deac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-bottle \
python313-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python-abi \
python313-aws-xray-sdk \
python313-bottle"

inherit rpm
