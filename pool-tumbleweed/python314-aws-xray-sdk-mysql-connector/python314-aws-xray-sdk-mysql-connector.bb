SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-mysql-connector-2.14.0-2.3.noarch.rpm"
RPM_HASH = "ec0207f54b91eeba624a29adf64222ce3c4e46651de9c65534ac8bfd455f33413460e09408490fdde33306d7396bdf455f0f018625b7a45115500728a1ae1771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-mysql-connector"

RDEPENDS:${PN} += "python-abi \
python314-aws-xray-sdk \
python314-mysql-connector-python"

inherit rpm
