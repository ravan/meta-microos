SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python313-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-all-2.14.0-2.3.noarch.rpm"
RPM_HASH = "94d44b5d53f43fa591d814c2ac22209216b3647901126857baa7aef544649b116dc339730ec6fc0e7b1cfb9e13e4579d0add335269fac91da45dda2b377f747e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-all \
python313-aws-xray-sdk-all"

RDEPENDS:${PN} += "python313-aws-xray-sdk"

inherit rpm
