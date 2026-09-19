SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-Flask-2.14.0-2.3.noarch.rpm"
RPM_HASH = "6ff41fa14105c5fbf504072cd52bb1310d5faf6241aa37a938319e65313d75560ad643c652d62fdb43b9411454da0fc2bbfb2e1fff31b7ca9c27f740fc06e34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-Flask"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-aws-xray-sdk"

inherit rpm
