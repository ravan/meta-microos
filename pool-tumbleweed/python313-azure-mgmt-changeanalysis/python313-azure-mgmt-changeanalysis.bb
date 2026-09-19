SUMMARY = "Microsoft Azure Changeanalysis Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Changeanalysis Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-changeanalysis-1.0.1-1.2.noarch.rpm"
RPM_HASH = "dfd2576eb2afd7677672a79a73a942d8035a13a0cc44484b14a992110f67ae554ca68add4a1e6e608ddc3d23a85e32e9b030a3b9c8667b17be4e78242ac41a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-changeanalysis \
python3.13dist-azure-mgmt-changeanalysis \
python313-azure-mgmt-changeanalysis \
python3dist-azure-mgmt-changeanalysis"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
