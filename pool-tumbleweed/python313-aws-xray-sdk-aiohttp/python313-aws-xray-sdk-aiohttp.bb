SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-aiohttp-2.14.0-2.3.noarch.rpm"
RPM_HASH = "bf839fa0347be2d6655625456151ba1553fca2d2d324137a55da9c7c72fa20fdb5931eafdf4de036e8f3de660c563d47ee23137af3f75ff9e82926e3752101fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-aiohttp \
python313-aws-xray-sdk-aiohttp"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-aws-xray-sdk"

inherit rpm
