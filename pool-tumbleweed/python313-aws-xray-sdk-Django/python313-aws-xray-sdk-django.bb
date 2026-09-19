SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-Django-2.14.0-2.3.noarch.rpm"
RPM_HASH = "2c605fde302ed9ec24a5ef96cd8f394510a9b02b9e5164b0285b130ff7ee8d65252cd5780ad385979a8f38f9fca4de85815c9d654ada01bdd1b1aa8fd3849748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Django \
python313-aws-xray-sdk-Django"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-aws-xray-sdk"

inherit rpm
