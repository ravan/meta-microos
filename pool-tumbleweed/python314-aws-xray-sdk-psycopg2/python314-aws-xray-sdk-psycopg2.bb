SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-psycopg2-2.14.0-2.3.noarch.rpm"
RPM_HASH = "f13cd451cd3439324e00387bcc2b3ee564e2ebd59b22413a6d0de64b346f03d630b88df35505226108255df4e2190246d781d509a882662d0cf177c94ecdbaf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-psycopg2"

RDEPENDS:${PN} += "python-abi \
python314-aws-xray-sdk \
python314-psycopg2"

inherit rpm
