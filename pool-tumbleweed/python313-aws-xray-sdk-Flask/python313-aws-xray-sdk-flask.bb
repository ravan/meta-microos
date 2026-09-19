SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-Flask-2.14.0-2.3.noarch.rpm"
RPM_HASH = "7b2aeb7b85c9b19eadeed1ba3c9a1b44bcbfab4a0bf99a84c591069eb3176044bd55d129f6d2ab88108111f701d9636956381c37935de67145703fb422170d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Flask \
python313-aws-xray-sdk-Flask"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-aws-xray-sdk"

inherit rpm
