SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-loadtestservice-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "7e77d50401cd3bafd33ea403391c83718b1ff7952c8f87bd12d24c9618bfd85032143f6f98e5f03b4a3b0f601be2a942b00dc026d612eb784897f5c65518ed2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-loadtestservice \
python314-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
