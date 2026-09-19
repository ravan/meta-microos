SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-aiohttp-2.14.0-2.3.noarch.rpm"
RPM_HASH = "55073a7dc9aa13b38bfa405ef4b7e92b40b5993a9f73db25c7646cf06b1d05e14b95d1628611e7222a6090c4c6e28c68ed45a4a470920876721f8ce05da90319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-aiohttp"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-aws-xray-sdk"

inherit rpm
