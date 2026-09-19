SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python314-pynamodb-6.1.0-1.5.noarch.rpm"
RPM_HASH = "afc6adedcf5b708b81f6234176412804864eca940264097799f25d421b178b93993bd331e0f964168e099ff6a361f7117676640ca67a97b282c90a673bde8706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynamodb \
python314-pynamodb \
python3dist-pynamodb"

RDEPENDS:${PN} += "python-abi \
python314-botocore \
python314-python-dateutil"

inherit rpm
