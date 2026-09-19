SUMMARY = "pymysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymysql backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-pymysql-2.14.0-2.3.noarch.rpm"
RPM_HASH = "614aee6b0c7c22a31fb86f727a34a273de2efb49437db2a571013f54987a09c2a81cbe0c5a77607a7c8147eb26177b787f3d5197b0c3e1e5183c0d475c3ed852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-pymysql"

RDEPENDS:${PN} += "python-abi \
python314-PyMySQL \
python314-aws-xray-sdk"

inherit rpm
