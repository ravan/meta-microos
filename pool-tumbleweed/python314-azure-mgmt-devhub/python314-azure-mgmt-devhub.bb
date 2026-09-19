SUMMARY = "Microsoft Azure Devhub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devhub Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-devhub-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "7c6834a22ea83b025bea391e66dc081249bd1556517a2b808d4b96717d155a5c1ad34e06cc8f82b9ebfe7804fa4f33cdf7b5765857d1b375068dba9298bfb5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-devhub \
python314-azure-mgmt-devhub \
python3dist-azure-mgmt-devhub"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
