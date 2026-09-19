SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-bottle-2.14.0-2.3.noarch.rpm"
RPM_HASH = "616eb69e590e30430e623766380b3afd497ebbc1b7e0bc0c92118addb6b97ddfca3060d919946d098666cd43ff502b44aa3fb246b2b5e41d0f163a83148d9fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python-abi \
python314-aws-xray-sdk \
python314-bottle"

inherit rpm
