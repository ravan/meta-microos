SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-Django-2.14.0-2.3.noarch.rpm"
RPM_HASH = "c5426ec88481b457ccece6095815181c5b088d98d8e05968be1b6063dd62901a1f5b51fa233fb69864a1b5d28e265fd7e6b3c617462c36770415f796b780d538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-Django"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-aws-xray-sdk"

inherit rpm
