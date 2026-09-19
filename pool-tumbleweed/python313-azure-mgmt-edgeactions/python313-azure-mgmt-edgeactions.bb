SUMMARY = "Microsoft Azure Edgeactions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeactions Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-edgeactions-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "777f6c65540c2b44b46cfc63edeb2b7b549af2d7ee6219dcd5497114cb12b0ce25f65485c8f8b7d688c4f6c784532e341b1af90be20b334757dae126d97c54b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgeactions \
python3.13dist-azure-mgmt-edgeactions \
python313-azure-mgmt-edgeactions \
python3dist-azure-mgmt-edgeactions"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
