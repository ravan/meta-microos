SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-automanage-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "ec9cea3ceae26162d8ae3387074fbdc51f3ceb263a39810951fff9267f0fe2d4e40a25b662d3773b7133a70622474c9fdc223dfd8f8db423ce92118578719e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-automanage \
python3.13dist-azure-mgmt-automanage \
python313-azure-mgmt-automanage \
python3dist-azure-mgmt-automanage"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.1 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
