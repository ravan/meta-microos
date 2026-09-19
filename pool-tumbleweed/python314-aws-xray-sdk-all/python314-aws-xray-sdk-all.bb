SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python314-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-all-2.14.0-2.3.noarch.rpm"
RPM_HASH = "c52990e75c808099b7abd3c32cdd480ca74b31a85e7b49256eb7216b83e94b8bdf3461fdd845643c870e07bc67102aa5d21cda66ea3a63fa24ec7b761e4c6080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-all"

RDEPENDS:${PN} += "python314-aws-xray-sdk"

inherit rpm
