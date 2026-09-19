SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.43.74"

RPM_NAME = "python313-boto3-1.43.74-1.1.noarch.rpm"
RPM_HASH = "8e474d4eed20ccbece6fd932682f0dcfbb1f16e18338fe505d73a5cdb695978f56a7dbe20e6cba871bc6ffd91edbf1d36392cc6f18e677a3fe2828efc2344e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boto3 \
python3.13dist-boto3 \
python313-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "-python313-botocore >= 1.43.74 with python313-botocore < 1.44.0 \
-python313-jmespath >= 0.7.1 with python313-jmespath < 2.0.0 \
-python313-s3transfer >= 0.19.0 with python313-s3transfer < 0.20.0 \
python-abi"

inherit rpm
