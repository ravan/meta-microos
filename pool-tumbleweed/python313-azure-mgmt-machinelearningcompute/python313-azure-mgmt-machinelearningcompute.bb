SUMMARY = "Microsoft Azure Machine Learning Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python313-azure-mgmt-machinelearningcompute-0.4.1-6.9.noarch.rpm"
RPM_HASH = "20093bd4656f49d84bb74be5f87bafeae63dff991637b77085a4b32607dd1b905917a102b0edc8c6d869bb8da554a9d53b878ee3c8236ffc5cd82ebe5944df74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-machinelearningcompute \
python3.13dist-azure-mgmt-machinelearningcompute \
python313-azure-mgmt-machinelearningcompute \
python3dist-azure-mgmt-machinelearningcompute"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.27 with python313-msrestazure < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
