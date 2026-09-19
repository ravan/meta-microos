SUMMARY = "Amazon Web Services Library"
DESCRIPTION = "Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for \
Python, which allows Python developers to write software that makes use of \
services like Amazon S3 and Amazon EC2. \
 \
For documentation consult the online documentation at \
http://boto3.readthedocs.org/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.43.74"

RPM_NAME = "python314-boto3-1.43.74-1.1.noarch.rpm"
RPM_HASH = "010bde8fa269a28307c123350df185f8610f5396f41c31b9dd4da9afd6cd40e9a17a353e5ea04fe99a04553a2ecc67d3885fb3ba8d79f13414d90706c35d2ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-boto3 \
python314-boto3 \
python3dist-boto3"

RDEPENDS:${PN} += "-python314-botocore >= 1.43.74 with python314-botocore < 1.44.0 \
-python314-jmespath >= 0.7.1 with python314-jmespath < 2.0.0 \
-python314-s3transfer >= 0.19.0 with python314-s3transfer < 0.20.0 \
python-abi"

inherit rpm
