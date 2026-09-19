SUMMARY = "The AWS X-Ray SDK for Python"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
It works through any one of various frameworks, provided by backends. The \
following backends are included in the main package: \
 \
  * botocore \
  * httplib \
  * sqlite3 \
 \
Additional backends can be installed by installing python314-aws-xray-sdk-backend \
packages.  The python314-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-2.14.0-2.3.noarch.rpm"
RPM_HASH = "6f5e1744c830284b1ee72c74b10cb58b88ba45b98e597ebdc78d44aee095d01b6113a8efedec35d6c2d8a5c39c775507216050f6b46c1303f8fa8c8a2164743d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aws-xray-sdk \
python314-aws-xray-sdk \
python3dist-aws-xray-sdk"

RDEPENDS:${PN} += "python-abi \
python314-botocore \
python314-wrapt"

inherit rpm
