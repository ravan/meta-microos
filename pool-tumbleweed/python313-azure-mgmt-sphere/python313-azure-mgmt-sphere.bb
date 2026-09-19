SUMMARY = "Microsoft Azure Sphere Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sphere Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-sphere-1.0.0-1.9.noarch.rpm"
RPM_HASH = "bf51c282ba1d4238f05734809858cfc18f7bed9b7763ed543088df2588c7106a2bee3004a7c0630ffbb78a59cdd24c751e21181800226d4fc468f4f074087f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sphere \
python3.13dist-azure-mgmt-sphere \
python313-azure-mgmt-sphere \
python3dist-azure-mgmt-sphere"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
