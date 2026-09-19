SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-mysql-connector-2.14.0-2.3.noarch.rpm"
RPM_HASH = "c91a76edc932cc28d150f32b8f4bfa1df09a5854ce2a146ac208f809f0c19d1e4830456551b12424842d703ed1a03c4e6ccf7f7d0cab148c8c856ab525b03170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-mysql-connector \
python313-aws-xray-sdk-mysql-connector"

RDEPENDS:${PN} += "python-abi \
python313-aws-xray-sdk \
python313-mysql-connector-python"

inherit rpm
