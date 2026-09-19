SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-requests-2.14.0-2.3.noarch.rpm"
RPM_HASH = "0e6b7d301ee2cb3ad0b09454cbe10a6f15832a5e5d66d7dbafba482c585bc882b7a80e2de68554a57e29ff715b30da16463ffb75bb1414edfa9aa661e724b05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-requests"

RDEPENDS:${PN} += "python-abi \
python314-aws-xray-sdk \
python314-requests"

inherit rpm
