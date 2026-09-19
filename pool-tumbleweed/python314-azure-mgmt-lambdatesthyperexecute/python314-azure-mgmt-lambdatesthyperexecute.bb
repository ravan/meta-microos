SUMMARY = "Microsoft Azure Lambdatesthyperexecute Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Lambdatesthyperexecute Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-lambdatesthyperexecute-1.0.0-1.5.noarch.rpm"
RPM_HASH = "5d1a3abfc6550d5ce0c7a04b76a916067c302681065f6c5cf210a9575b1ce87ea3d891d97bc794d3bc4fef5e5f5ddb8f811499d7bfe536c1a9e81f2c068176a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-lambdatesthyperexecute \
python314-azure-mgmt-lambdatesthyperexecute \
python3dist-azure-mgmt-lambdatesthyperexecute"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
