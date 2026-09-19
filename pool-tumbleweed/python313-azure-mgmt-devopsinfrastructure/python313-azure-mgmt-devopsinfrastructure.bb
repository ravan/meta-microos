SUMMARY = "Microsoft Azure Devopsinfrastructure Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devopsinfrastructure Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-devopsinfrastructure-1.0.0-1.8.noarch.rpm"
RPM_HASH = "3ca0b1b56c1a8a5d0b45f1c82a32db9ae15bab5fd698be4409df8f0b1181cd55cfbde6e4b13147f6ebd83acf0a3b3daa11ddcf5a0327398d31fab687f455982c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devopsinfrastructure \
python3.13dist-azure-mgmt-devopsinfrastructure \
python313-azure-mgmt-devopsinfrastructure \
python3dist-azure-mgmt-devopsinfrastructure"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
