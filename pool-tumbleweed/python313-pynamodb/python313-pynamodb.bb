SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python313-pynamodb-6.1.0-1.5.noarch.rpm"
RPM_HASH = "4cab9edb15293ec6c35ed9acc547f5702fe730759a18e60b6bf87125afee56797239cc3ec90b54bddaa2fd72c990cd13bbbdcc9266406ddeb40080695d30126b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynamodb \
python3.13dist-pynamodb \
python313-pynamodb \
python3dist-pynamodb"

RDEPENDS:${PN} += "python-abi \
python313-botocore \
python313-python-dateutil"

inherit rpm
