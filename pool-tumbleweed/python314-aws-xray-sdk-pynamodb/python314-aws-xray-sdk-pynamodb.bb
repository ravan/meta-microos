SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-pynamodb-2.14.0-2.3.noarch.rpm"
RPM_HASH = "7d6c636137ad09231ba6e47714ce2cb96da518a66e155f8fbe4826a88c5e0011a9068596357359848b3f79ecc47614ddb3edf608f1d7d6a9af6b12ff448ac3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python314-aws-xray-sdk \
python314-pynamodb"

inherit rpm
