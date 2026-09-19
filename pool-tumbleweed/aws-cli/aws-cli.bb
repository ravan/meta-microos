SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.45.64"

RPM_NAME = "aws-cli-1.45.64-1.1.noarch.rpm"
RPM_HASH = "3364f809a641eb1ec2f854a860a0d6da525eff2da9e128985ace8564e8aed849732013ed38257c5d6569ade2802ee8f8bd9f0beeb88381918977d125d471105f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-cli \
awscli \
config-aws-cli \
python3.13dist-awscli \
python3dist-awscli"

RDEPENDS:${PN} += "-python313-PyYAML >= 3.10 with python313-PyYAML <= 6.1 \
-python313-colorama >= 0.2.5 with python313-colorama <= 0.5.0 \
-python313-docutils >= 0.18.1 with python313-docutils < 0.30 \
-python313-rsa >= 3.1.2 with python313-rsa < 5.0.0 \
-python313-s3transfer >= 0.19.0 with python313-s3transfer < 0.20.0 \
/usr/bin/python3.13 \
groff \
python-abi \
python313 \
python313-botocore \
python313-six"

inherit rpm
