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
Additional backends can be installed by installing python313-aws-xray-sdk-backend \
packages.  The python313-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-2.14.0-2.3.noarch.rpm"
RPM_HASH = "bb12cc30e75886cbecd4b219423106f43f21a8a3a2b10c8e572a62ea210bd41ed72aea2ce31414105808bc20e18f4388ac0006f10ddd49304dd623bb4b763dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk \
python3.13dist-aws-xray-sdk \
python313-aws-xray-sdk \
python3dist-aws-xray-sdk"

RDEPENDS:${PN} += "python-abi \
python313-botocore \
python313-wrapt"

inherit rpm
