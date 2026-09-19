SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-elasticsan-2.0.0-1.4.noarch.rpm"
RPM_HASH = "34e716337464c4cbe99b56280baa4c4f4835aaffbc6d197b667dd53fc922af2644ff02b241a809aaa36414bfda619994f37450293dfa06361ae18c3dff466635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elasticsan \
python3.13dist-azure-mgmt-elasticsan \
python313-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
