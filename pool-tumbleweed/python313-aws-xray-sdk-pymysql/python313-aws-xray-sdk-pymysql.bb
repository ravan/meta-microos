SUMMARY = "pymysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymysql backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-pymysql-2.14.0-2.3.noarch.rpm"
RPM_HASH = "0cc3a7d94034f1bfe2719c77360791bb765f7e0dc534690c89b33083cb07c88399e6214e592ffe90a753326476eea936c8162d7b03c38a5a1ba3cdad2a95f7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pymysql \
python313-aws-xray-sdk-pymysql"

RDEPENDS:${PN} += "python-abi \
python313-PyMySQL \
python313-aws-xray-sdk"

inherit rpm
