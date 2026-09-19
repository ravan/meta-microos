SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-requests-2.14.0-2.3.noarch.rpm"
RPM_HASH = "af441edb9971d26465299c0367fda8f54a7d15f2221c26656c74fe12ad2c23accf3b518599e68903fce316944ff14cb2fe9f79930a03bcd8ba67c77b028a8eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-requests \
python313-aws-xray-sdk-requests"

RDEPENDS:${PN} += "python-abi \
python313-aws-xray-sdk \
python313-requests"

inherit rpm
